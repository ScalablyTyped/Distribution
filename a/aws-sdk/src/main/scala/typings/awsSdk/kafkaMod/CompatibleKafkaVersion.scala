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
  def apply(): CompatibleKafkaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleKafkaVersion]
  }
  @scala.inline
  implicit class CompatibleKafkaVersionOps[Self <: CompatibleKafkaVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSourceVersion(value: string): Self = this.set("SourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceVersion: Self = this.set("SourceVersion", js.undefined)
    @scala.inline
    def setTargetVersionsVarargs(value: string*): Self = this.set("TargetVersions", js.Array(value :_*))
    @scala.inline
    def setTargetVersions(value: listOfString): Self = this.set("TargetVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetVersions: Self = this.set("TargetVersions", js.undefined)
  }
  
}

