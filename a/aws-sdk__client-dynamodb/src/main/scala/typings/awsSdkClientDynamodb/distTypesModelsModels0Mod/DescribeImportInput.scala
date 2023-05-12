package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportInput extends StObject {
  
  /**
    * <p> The Amazon Resource Name (ARN) associated with the table you're importing to. </p>
    */
  var ImportArn: js.UndefOr[String] = js.undefined
}
object DescribeImportInput {
  
  inline def apply(): DescribeImportInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeImportInput] (val x: Self) extends AnyVal {
    
    inline def setImportArn(value: String): Self = StObject.set(x, "ImportArn", value.asInstanceOf[js.Any])
    
    inline def setImportArnUndefined: Self = StObject.set(x, "ImportArn", js.undefined)
  }
}
