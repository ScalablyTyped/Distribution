package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyGroup extends StObject {
  
  /**
    * The identifier for the key group.
    */
  var Id: String
  
  /**
    * The key group configuration.
    */
  var KeyGroupConfig: typings.awsSdk.cloudfrontMod.KeyGroupConfig
  
  /**
    * The date and time when the key group was last modified.
    */
  var LastModifiedTime: timestamp
}
object KeyGroup {
  
  @scala.inline
  def apply(Id: String, KeyGroupConfig: KeyGroupConfig, LastModifiedTime: timestamp): KeyGroup = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], KeyGroupConfig = KeyGroupConfig.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGroup]
  }
  
  @scala.inline
  implicit class KeyGroupMutableBuilder[Self <: KeyGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyGroupConfig(value: KeyGroupConfig): Self = StObject.set(x, "KeyGroupConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
