package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object snsMod {
  
  type ActionsList = js.Array[typings.awsSdk.snsMod.action]
  
  type AmazonResourceName = java.lang.String
  
  type Binary = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.snsMod.Blob | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.snsMod.ClientApiVersions
  
  type DelegatesList = js.Array[typings.awsSdk.snsMod.delegate]
  
  type ListOfEndpoints = js.Array[typings.awsSdk.snsMod.Endpoint_]
  
  type ListOfPlatformApplications = js.Array[typings.awsSdk.snsMod.PlatformApplication]
  
  type ListString = js.Array[typings.awsSdk.snsMod.String]
  
  type MapStringToString = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.snsMod.String]
  
  type MessageAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.snsMod.MessageAttributeValue]
  
  type PhoneNumber = java.lang.String
  
  type PhoneNumberList = js.Array[typings.awsSdk.snsMod.PhoneNumber]
  
  type String = java.lang.String
  
  type SubscriptionAttributesMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.snsMod.attributeValue]
  
  type SubscriptionsList = js.Array[typings.awsSdk.snsMod.Subscription]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.snsMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.snsMod.Tag]
  
  type TagValue = java.lang.String
  
  type TopicAttributesMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.snsMod.attributeValue]
  
  type TopicsList = js.Array[typings.awsSdk.snsMod.Topic]
  
  type account = java.lang.String
  
  type action = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2010-03-31`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.snsMod._apiVersion | java.lang.String
  
  type attributeName = java.lang.String
  
  type attributeValue = java.lang.String
  
  type authenticateOnUnsubscribe = java.lang.String
  
  type delegate = java.lang.String
  
  type endpoint = java.lang.String
  
  type label = java.lang.String
  
  type message = java.lang.String
  
  type messageId = java.lang.String
  
  type messageStructure = java.lang.String
  
  type nextToken = java.lang.String
  
  type protocol = java.lang.String
  
  type subject = java.lang.String
  
  type subscriptionARN = java.lang.String
  
  type token = java.lang.String
  
  type topicARN = java.lang.String
  
  type topicName = java.lang.String
}
