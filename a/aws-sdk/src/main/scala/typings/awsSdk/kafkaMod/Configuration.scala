package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: string
  
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: timestampIso8601
  
  /**
    * 
    The description of the configuration.
    
    */
  var Description: string
  
  /**
    * 
    An array of the versions of Apache Kafka with which you can use this MSK configuration. You can use this configuration for an MSK cluster only if the Apache Kafka version specified for the cluster appears in this array.
    
    */
  var KafkaVersions: listOfString
  
  /**
    * 
    Latest revision of the configuration.
    
    */
  var LatestRevision: ConfigurationRevision
  
  /**
    * 
    The name of the configuration.
    
    */
  var Name: string
  
  /**
    * 
    The state of the configuration. The possible states are ACTIVE, DELETING, and DELETE_FAILED. 
    
    */
  var State: ConfigurationState
}
object Configuration {
  
  @scala.inline
  def apply(
    Arn: string,
    CreationTime: timestampIso8601,
    Description: string,
    KafkaVersions: listOfString,
    LatestRevision: ConfigurationRevision,
    Name: string,
    State: ConfigurationState
  ): Configuration = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], KafkaVersions = KafkaVersions.asInstanceOf[js.Any], LatestRevision = LatestRevision.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: timestampIso8601): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKafkaVersions(value: listOfString): Self = StObject.set(x, "KafkaVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKafkaVersionsVarargs(value: string*): Self = StObject.set(x, "KafkaVersions", js.Array(value :_*))
    
    @scala.inline
    def setLatestRevision(value: ConfigurationRevision): Self = StObject.set(x, "LatestRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: ConfigurationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
