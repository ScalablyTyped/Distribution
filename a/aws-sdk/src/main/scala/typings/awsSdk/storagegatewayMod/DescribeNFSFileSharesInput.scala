package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNFSFileSharesInput extends js.Object {
  /**
    * An array containing the Amazon Resource Name (ARN) of each file share to be described. 
    */
  var FileShareARNList: typings.awsSdk.storagegatewayMod.FileShareARNList = js.native
}

object DescribeNFSFileSharesInput {
  @scala.inline
  def apply(FileShareARNList: FileShareARNList): DescribeNFSFileSharesInput = {
    val __obj = js.Dynamic.literal(FileShareARNList = FileShareARNList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeNFSFileSharesInput]
  }
}

