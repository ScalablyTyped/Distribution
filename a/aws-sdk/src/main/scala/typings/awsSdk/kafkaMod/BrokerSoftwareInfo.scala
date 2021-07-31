package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerSoftwareInfo extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration used for the cluster. This field isn't visible in this preview release.
    
    */
  var ConfigurationArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The revision of the configuration to use. This field isn't visible in this preview release.
    
    */
  var ConfigurationRevision: js.UndefOr[long] = js.undefined
  
  /**
    * 
    The version of Apache Kafka.
    
    */
  var KafkaVersion: js.UndefOr[string] = js.undefined
}
object BrokerSoftwareInfo {
  
  @scala.inline
  def apply(): BrokerSoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerSoftwareInfo]
  }
  
  @scala.inline
  implicit class BrokerSoftwareInfoMutableBuilder[Self <: BrokerSoftwareInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationArn(value: string): Self = StObject.set(x, "ConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationArnUndefined: Self = StObject.set(x, "ConfigurationArn", js.undefined)
    
    @scala.inline
    def setConfigurationRevision(value: long): Self = StObject.set(x, "ConfigurationRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationRevisionUndefined: Self = StObject.set(x, "ConfigurationRevision", js.undefined)
    
    @scala.inline
    def setKafkaVersion(value: string): Self = StObject.set(x, "KafkaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKafkaVersionUndefined: Self = StObject.set(x, "KafkaVersion", js.undefined)
  }
}
