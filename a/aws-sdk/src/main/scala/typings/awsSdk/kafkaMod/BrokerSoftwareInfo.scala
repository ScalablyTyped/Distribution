package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerSoftwareInfo extends js.Object {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration used for the cluster. This field isn't visible in this preview release.
    
    */
  var ConfigurationArn: js.UndefOr[string] = js.native
  
  /**
    * 
    The revision of the configuration to use. This field isn't visible in this preview release.
    
    */
  var ConfigurationRevision: js.UndefOr[long] = js.native
  
  /**
    * 
    The version of Apache Kafka.
    
    */
  var KafkaVersion: js.UndefOr[string] = js.native
}
object BrokerSoftwareInfo {
  
  @scala.inline
  def apply(): BrokerSoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerSoftwareInfo]
  }
  
  @scala.inline
  implicit class BrokerSoftwareInfoOps[Self <: BrokerSoftwareInfo] (val x: Self) extends AnyVal {
    
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
    def setConfigurationArn(value: string): Self = this.set("ConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationArn: Self = this.set("ConfigurationArn", js.undefined)
    
    @scala.inline
    def setConfigurationRevision(value: long): Self = this.set("ConfigurationRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationRevision: Self = this.set("ConfigurationRevision", js.undefined)
    
    @scala.inline
    def setKafkaVersion(value: string): Self = this.set("KafkaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKafkaVersion: Self = this.set("KafkaVersion", js.undefined)
  }
}
