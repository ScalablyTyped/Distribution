package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
  /**
    * An Amazon DynamoDB table location.
    */
  var DynamoDB: js.UndefOr[CodeGenNodeArgs] = js.native
  
  /**
    * A JDBC location.
    */
  var Jdbc: js.UndefOr[CodeGenNodeArgs] = js.native
  
  /**
    * An Amazon Simple Storage Service (Amazon S3) location.
    */
  var S3: js.UndefOr[CodeGenNodeArgs] = js.native
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamoDB(value: CodeGenNodeArgs): Self = StObject.set(x, "DynamoDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamoDBUndefined: Self = StObject.set(x, "DynamoDB", js.undefined)
    
    @scala.inline
    def setDynamoDBVarargs(value: CodeGenNodeArg*): Self = StObject.set(x, "DynamoDB", js.Array(value :_*))
    
    @scala.inline
    def setJdbc(value: CodeGenNodeArgs): Self = StObject.set(x, "Jdbc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJdbcUndefined: Self = StObject.set(x, "Jdbc", js.undefined)
    
    @scala.inline
    def setJdbcVarargs(value: CodeGenNodeArg*): Self = StObject.set(x, "Jdbc", js.Array(value :_*))
    
    @scala.inline
    def setS3(value: CodeGenNodeArgs): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    @scala.inline
    def setS3Varargs(value: CodeGenNodeArg*): Self = StObject.set(x, "S3", js.Array(value :_*))
  }
}
