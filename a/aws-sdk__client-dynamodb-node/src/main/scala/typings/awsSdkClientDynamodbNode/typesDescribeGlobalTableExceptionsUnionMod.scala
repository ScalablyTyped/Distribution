package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeGlobalTableExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
    - typings.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
  */
  trait DescribeGlobalTableExceptionsUnion extends StObject
  object DescribeGlobalTableExceptionsUnion {
    
    inline def GlobalTableNotFoundException(): typings.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "GlobalTableNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException]
    }
    
    inline def InternalServerError(): typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
  }
}
