package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createBucketExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientS3Node.typesBucketAlreadyExistsMod.BucketAlreadyExists
    - typings.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou
  */
  trait CreateBucketExceptionsUnion extends StObject
  object CreateBucketExceptionsUnion {
    
    @scala.inline
    def BucketAlreadyExists(name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyExists): typings.awsSdkClientS3Node.typesBucketAlreadyExistsMod.BucketAlreadyExists = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesBucketAlreadyExistsMod.BucketAlreadyExists]
    }
    
    @scala.inline
    def BucketAlreadyOwnedByYou(name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyOwnedByYou): typings.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou]
    }
  }
}
