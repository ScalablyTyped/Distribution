package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTextEditor[TProperties]
  extends StObject
     with Editor[TProperties] {
  
  /**
    * Removes focus from the input element.
    */
  def blur(): Unit = js.native
  
  /**
    * Gets an instance of a custom action button.
    */
  def getButton(name: String): js.UndefOr[dxButton] = js.native
}
object dxTextEditor {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  type Properties = dxTextEditorOptions[TextEditorInstance]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  @js.native
  trait TextEditorInstance
    extends StObject
       with dxTextEditor[Properties]
}
