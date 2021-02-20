package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("camljs", "Internal")
@js.native
class Internal () extends StObject
object Internal {
  
  /* static member */
  @JSImport("camljs", "Internal.createExpression")
  @js.native
  def createExpression(): IFieldExpression = js.native
  
  /* static member */
  @JSImport("camljs", "Internal.createRawQuery")
  @js.native
  def createRawQuery(xml: String): IRawQuery = js.native
  
  /* static member */
  @JSImport("camljs", "Internal.createView")
  @js.native
  def createView(): IView = js.native
  @JSImport("camljs", "Internal.createView")
  @js.native
  def createView(viewFields: js.Array[ViewField]): IView = js.native
  
  /* static member */
  @JSImport("camljs", "Internal.createViewFields")
  @js.native
  def createViewFields(viewFields: js.Array[String]): IFinalizableToString = js.native
  
  /* static member */
  @JSImport("camljs", "Internal.createWhere")
  @js.native
  def createWhere(): IFieldExpression = js.native
}
