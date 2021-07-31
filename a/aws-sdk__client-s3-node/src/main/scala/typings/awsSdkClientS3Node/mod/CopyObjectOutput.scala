package typings.awsSdkClientS3Node.mod

import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyObjectOutput
  extends StObject
     with typings.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput
object CopyObjectOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): CopyObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyObjectOutput]
  }
}
