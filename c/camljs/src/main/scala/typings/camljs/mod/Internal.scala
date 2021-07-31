package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("camljs", "Internal")
@js.native
class Internal () extends StObject
object Internal {
  
  @JSImport("camljs", "Internal")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createExpression(): IFieldExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createExpression")().asInstanceOf[IFieldExpression]
  
  /* static member */
  @scala.inline
  def createRawQuery(xml: String): IRawQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("createRawQuery")(xml.asInstanceOf[js.Any]).asInstanceOf[IRawQuery]
  
  /* static member */
  @scala.inline
  def createView(): IView = ^.asInstanceOf[js.Dynamic].applyDynamic("createView")().asInstanceOf[IView]
  @scala.inline
  def createView(viewFields: js.Array[ViewField]): IView = ^.asInstanceOf[js.Dynamic].applyDynamic("createView")(viewFields.asInstanceOf[js.Any]).asInstanceOf[IView]
  
  /* static member */
  @scala.inline
  def createViewFields(viewFields: js.Array[String]): IFinalizableToString = ^.asInstanceOf[js.Dynamic].applyDynamic("createViewFields")(viewFields.asInstanceOf[js.Any]).asInstanceOf[IFinalizableToString]
  
  /* static member */
  @scala.inline
  def createWhere(): IFieldExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createWhere")().asInstanceOf[IFieldExpression]
}
