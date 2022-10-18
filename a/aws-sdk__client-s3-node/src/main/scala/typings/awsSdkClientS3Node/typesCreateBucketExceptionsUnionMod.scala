package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateBucketExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientS3Node.typesBucketAlreadyExistsMod.BucketAlreadyExists
    - typings.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou
  */
  trait CreateBucketExceptionsUnion extends StObject
  object CreateBucketExceptionsUnion {
    
    inline def BucketAlreadyExists(): typings.awsSdkClientS3Node.typesBucketAlreadyExistsMod.BucketAlreadyExists = {
      val __obj = js.Dynamic.literal(name = "BucketAlreadyExists")
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesBucketAlreadyExistsMod.BucketAlreadyExists]
    }
    
    inline def BucketAlreadyOwnedByYou(): typings.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou = {
      val __obj = js.Dynamic.literal(name = "BucketAlreadyOwnedByYou")
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou]
    }
  }
}
