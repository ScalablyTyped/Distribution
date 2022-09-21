package typings.awsSdkSharedIniFileLoader

import typings.awsSdkSharedIniFileLoader.loadSharedConfigFilesMod.SharedConfigInit
import typings.awsSdkTypes.profileMod.ParsedIniData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseKnownFilesMod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/parseKnownFiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseKnownFiles(init: SourceProfileInit): js.Promise[ParsedIniData] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKnownFiles")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedIniData]]
  
  trait SourceProfileInit
    extends StObject
       with SharedConfigInit {
    
    /**
      * The configuration profile to use.
      */
    var profile: js.UndefOr[String] = js.undefined
  }
  object SourceProfileInit {
    
    inline def apply(): SourceProfileInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceProfileInit]
    }
    
    extension [Self <: SourceProfileInit](x: Self) {
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    }
  }
}
