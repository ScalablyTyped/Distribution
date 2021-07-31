package typings.breeze.global.breeze

import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.DataTypeSymbol")
@js.native
class DataTypeSymbol ()
  extends StObject
     with typings.breeze.breeze.DataTypeSymbol {
  
  /* CompleteClass */
  var defaultValue: js.Any = js.native
  
  /** Function to format this DataType for OData queries. */
  /* CompleteClass */
  override def fmtOData(`val`: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def getName(): String = js.native
  
  /* CompleteClass */
  var parentEnum: IEnum = js.native
  
  /* CompleteClass */
  override def validatorCtor(context: js.Any): typings.breeze.breeze.Validator = js.native
}
