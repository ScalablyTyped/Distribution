package typings.deezerSdk

import typings.deezerSdk.DeezerSdk.Track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken_ extends StObject {
    
    var accessToken: String
    
    var expire: String
  }
  object AccessToken_ {
    
    inline def apply(accessToken: String, expire: String): AccessToken_ = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessToken_] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setExpire(value: String): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    }
  }
  
  trait Accesstoken extends StObject {
    
    val access_token: String
    
    val expire: String
  }
  object Accesstoken {
    
    inline def apply(access_token: String, expire: String): Accesstoken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accesstoken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpire(value: String): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    }
  }
  
  trait Artist extends StObject {
    
    var artist: String
    
    var cover: String
    
    var title: String
  }
  object Artist {
    
    inline def apply(artist: String, cover: String, title: String): Artist = {
      val __obj = js.Dynamic.literal(artist = artist.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Artist]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Artist] (val x: Self) extends AnyVal {
      
      inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      inline def setCover(value: String): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Expire extends StObject {
    
    var accessToken: String
    
    var expire: String
    
    var userID: String
  }
  object Expire {
    
    inline def apply(accessToken: String, expire: String, userID: String): Expire = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expire]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Expire] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setExpire(value: String): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var track: Track
  }
  object Index {
    
    inline def apply(index: Double, track: Track): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: Track): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
}
