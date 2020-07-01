package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompatibleKafkaVersion extends js.Object {
  /**
    * 
    A Kafka version.
    
    */
  var SourceVersion: js.UndefOr[string] = js.native
  /**
    * 
    A list of Kafka versions.
    
    */
  var TargetVersions: js.UndefOr[listOfString] = js.native
}

object CompatibleKafkaVersion {
  @scala.inline
  def apply(SourceVersion: string = null, TargetVersions: listOfString = null): CompatibleKafkaVersion = {
    val __obj = js.Dynamic.literal()
    if (SourceVersion != null) __obj.updateDynamic("SourceVersion")(SourceVersion.asInstanceOf[js.Any])
    if (TargetVersions != null) __obj.updateDynamic("TargetVersions")(TargetVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompatibleKafkaVersion]
  }
}

