package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends ComponentProperties {
  val id: String = js.native
  /**
    * Whether the component is valid or not
    */
  val valid: Boolean = js.native
  /**
    * Focuses the component.
    */
  def focus(): Thenable[Unit] = js.native
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
    * Run the component's validations
    */
  def validate(): Thenable[Boolean] = js.native
}

