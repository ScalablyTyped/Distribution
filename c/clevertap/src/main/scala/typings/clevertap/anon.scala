package typings.clevertap

import typings.clevertap.clevertapStrings.event
import typings.clevertap.clevertapStrings.profile
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: String
    
    var platform_specific: js.UndefOr[Record[String, Any]] = js.undefined
    
    var replacements: js.UndefOr[Record[String, Any]] = js.undefined
    
    var title: String
  }
  object Body {
    
    inline def apply(body: String, title: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setPlatform_specific(value: Record[String, Any]): Self = StObject.set(x, "platform_specific", value.asInstanceOf[js.Any])
      
      inline def setPlatform_specificUndefined: Self = StObject.set(x, "platform_specific", js.undefined)
      
      inline def setReplacements(value: Record[String, Any]): Self = StObject.set(x, "replacements", value.asInstanceOf[js.Any])
      
      inline def setReplacementsUndefined: Self = StObject.set(x, "replacements", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Commonprofileproperties extends StObject {
    
    var common_profile_properties: js.UndefOr[Profilefields] = js.undefined
    
    var event_name: js.UndefOr[String] = js.undefined
    
    var from: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[Double] = js.undefined
  }
  object Commonprofileproperties {
    
    inline def apply(): Commonprofileproperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Commonprofileproperties]
    }
    
    extension [Self <: Commonprofileproperties](x: Self) {
      
      inline def setCommon_profile_properties(value: Profilefields): Self = StObject.set(x, "common_profile_properties", value.asInstanceOf[js.Any])
      
      inline def setCommon_profile_propertiesUndefined: Self = StObject.set(x, "common_profile_properties", js.undefined)
      
      inline def setEvent_name(value: String): Self = StObject.set(x, "event_name", value.asInstanceOf[js.Any])
      
      inline def setEvent_nameUndefined: Self = StObject.set(x, "event_name", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait Debug extends StObject {
    
    var debug: js.UndefOr[Double] = js.undefined
  }
  object Debug {
    
    inline def apply(): Debug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var objectId: js.UndefOr[String] = js.undefined
  }
  object Email {
    
    inline def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    }
  }
  
  trait EvtData extends StObject {
    
    var evtData: Record[String, Any]
    
    var evtName: String
    
    var ts: js.UndefOr[Double] = js.undefined
    
    var `type`: event
  }
  object EvtData {
    
    inline def apply(evtData: Record[String, Any], evtName: String): EvtData = {
      val __obj = js.Dynamic.literal(evtData = evtData.asInstanceOf[js.Any], evtName = evtName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("event")
      __obj.asInstanceOf[EvtData]
    }
    
    extension [Self <: EvtData](x: Self) {
      
      inline def setEvtData(value: Record[String, Any]): Self = StObject.set(x, "evtData", value.asInstanceOf[js.Any])
      
      inline def setEvtName(value: String): Self = StObject.set(x, "evtName", value.asInstanceOf[js.Any])
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
      
      inline def setType(value: event): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FBID extends StObject {
    
    var FBID: js.UndefOr[String] = js.undefined
    
    var GPID: js.UndefOr[String] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var objectId: js.UndefOr[String] = js.undefined
  }
  object FBID {
    
    inline def apply(): FBID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FBID]
    }
    
    extension [Self <: FBID](x: Self) {
      
      inline def setFBID(value: String): Self = StObject.set(x, "FBID", value.asInstanceOf[js.Any])
      
      inline def setFBIDUndefined: Self = StObject.set(x, "FBID", js.undefined)
      
      inline def setGPID(value: String): Self = StObject.set(x, "GPID", value.asInstanceOf[js.Any])
      
      inline def setGPIDUndefined: Self = StObject.set(x, "GPID", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    }
  }
  
  trait From extends StObject {
    
    var from: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[Double] = js.undefined
  }
  object From {
    
    inline def apply(): From = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: Double
  }
  object Id {
    
    inline def apply(id: Double): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProfileData extends StObject {
    
    var profileData: Record[String, Any]
    
    var ts: js.UndefOr[Double] = js.undefined
    
    var `type`: profile
  }
  object ProfileData {
    
    inline def apply(profileData: Record[String, Any]): ProfileData = {
      val __obj = js.Dynamic.literal(profileData = profileData.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("profile")
      __obj.asInstanceOf[ProfileData]
    }
    
    extension [Self <: ProfileData](x: Self) {
      
      inline def setProfileData(value: Record[String, Any]): Self = StObject.set(x, "profileData", value.asInstanceOf[js.Any])
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
      
      inline def setType(value: profile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Profilefields extends StObject {
    
    var profile_fields: js.Array[Record[String, Any]]
  }
  object Profilefields {
    
    inline def apply(profile_fields: js.Array[Record[String, Any]]): Profilefields = {
      val __obj = js.Dynamic.literal(profile_fields = profile_fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profilefields]
    }
    
    extension [Self <: Profilefields](x: Self) {
      
      inline def setProfile_fields(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "profile_fields", value.asInstanceOf[js.Any])
      
      inline def setProfile_fieldsVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "profile_fields", js.Array(value*))
    }
  }
}
