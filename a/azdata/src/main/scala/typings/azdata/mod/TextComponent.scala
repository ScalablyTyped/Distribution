package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.Component because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined id, updateProperties, updateProperty, updateCssStyles, onValidityChanged, onValidityChanged, onValidityChanged, onValidityChanged, valid, validate, focus */ @js.native
trait TextComponent extends TextComponentProperties {
  
  /**
    * Focuses the component.
    */
  def focus(): Thenable[Unit] = js.native
  
  val id: String = js.native
  
  /**
    * Event fired to notify that the component's validity has changed
    */
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, _]): Disposable = js.native
  def onValidityChanged(
    listener: js.Function1[/* e */ Boolean, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, _], thisArgs: js.Any): Disposable = js.native
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Updates the specified CSS Styles and notifies the UI
    * @param cssStyles The styles to update
    * @returns Thenable that completes once the update has been applied to the UI
    */
  def updateCssStyles(cssStyles: StringDictionary[String]): Thenable[Unit] = js.native
  
  /**
    * Sends any updated properties of the component to the UI
    *
    * @returns Thenable that completes once the update
    * has been applied in the UI
    */
  def updateProperties(properties: StringDictionary[js.Any]): Thenable[Unit] = js.native
  
  /**
    * Sends an updated property of the component to the UI
    *
    * @returns Thenable that completes once the update
    * has been applied in the UI
    */
  def updateProperty(key: String, value: js.Any): Thenable[Unit] = js.native
  
  /**
    * Whether the component is valid or not
    */
  val valid: Boolean = js.native
  
  /**
    * Run the component's validations
    */
  def validate(): Thenable[Boolean] = js.native
}
