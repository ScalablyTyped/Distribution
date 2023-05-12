package typings.cookiebotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CcpaApplies extends StObject {
    
    var ccpaApplies: Boolean
    
    var gdprApplies: Boolean
    
    var lgpdApplies: Boolean
  }
  object CcpaApplies {
    
    inline def apply(ccpaApplies: Boolean, gdprApplies: Boolean, lgpdApplies: Boolean): CcpaApplies = {
      val __obj = js.Dynamic.literal(ccpaApplies = ccpaApplies.asInstanceOf[js.Any], gdprApplies = gdprApplies.asInstanceOf[js.Any], lgpdApplies = lgpdApplies.asInstanceOf[js.Any])
      __obj.asInstanceOf[CcpaApplies]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CcpaApplies] (val x: Self) extends AnyVal {
      
      inline def setCcpaApplies(value: Boolean): Self = StObject.set(x, "ccpaApplies", value.asInstanceOf[js.Any])
      
      inline def setGdprApplies(value: Boolean): Self = StObject.set(x, "gdprApplies", value.asInstanceOf[js.Any])
      
      inline def setLgpdApplies(value: Boolean): Self = StObject.set(x, "lgpdApplies", value.asInstanceOf[js.Any])
    }
  }
  
  trait Marketing extends StObject {
    
    var marketing: Boolean
    
    var necessary: Boolean
    
    var preferences: Boolean
    
    var stamp: String
    
    var statistics: Boolean
  }
  object Marketing {
    
    inline def apply(marketing: Boolean, necessary: Boolean, preferences: Boolean, stamp: String, statistics: Boolean): Marketing = {
      val __obj = js.Dynamic.literal(marketing = marketing.asInstanceOf[js.Any], necessary = necessary.asInstanceOf[js.Any], preferences = preferences.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marketing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Marketing] (val x: Self) extends AnyVal {
      
      inline def setMarketing(value: Boolean): Self = StObject.set(x, "marketing", value.asInstanceOf[js.Any])
      
      inline def setNecessary(value: Boolean): Self = StObject.set(x, "necessary", value.asInstanceOf[js.Any])
      
      inline def setPreferences(value: Boolean): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
      
      inline def setStamp(value: String): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      
      inline def setStatistics(value: Boolean): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    }
  }
}
