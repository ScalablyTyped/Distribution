package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object env {
  
  @js.native
  sealed trait AppQuality extends StObject
  @JSImport("azdata", "env.AppQuality")
  @js.native
  object AppQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AppQuality & String] = js.native
    
    @js.native
    sealed trait dev
      extends StObject
         with AppQuality
    /* "dev" */ val dev: typings.azdata.mod.env.AppQuality.dev & String = js.native
    
    @js.native
    sealed trait insider
      extends StObject
         with AppQuality
    /* "insider" */ val insider: typings.azdata.mod.env.AppQuality.insider & String = js.native
    
    @js.native
    sealed trait stable
      extends StObject
         with AppQuality
    /* "stable" */ val stable: typings.azdata.mod.env.AppQuality.stable & String = js.native
  }
  
  @JSImport("azdata", "env.quality")
  @js.native
  val quality: js.UndefOr[AppQuality | String] = js.native
}
