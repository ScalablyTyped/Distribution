package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object simpledbMod {
  type AttributeList = js.Array[typings.awsSdk.simpledbMod.Attribute]
  type AttributeNameList = js.Array[typings.awsSdk.simpledbMod.String]
  type Boolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.simpledbMod.ClientApiVersions
  type DeletableAttributeList = js.Array[typings.awsSdk.simpledbMod.DeletableAttribute]
  type DeletableItemList = js.Array[typings.awsSdk.simpledbMod.DeletableItem]
  type DomainNameList = js.Array[typings.awsSdk.simpledbMod.String]
  type Integer = scala.Double
  type ItemList = js.Array[typings.awsSdk.simpledbMod.Item]
  type Long = scala.Double
  type ReplaceableAttributeList = js.Array[typings.awsSdk.simpledbMod.ReplaceableAttribute]
  type ReplaceableItemList = js.Array[typings.awsSdk.simpledbMod.ReplaceableItem]
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2009-04-15`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.simpledbMod._apiVersion | java.lang.String
}
