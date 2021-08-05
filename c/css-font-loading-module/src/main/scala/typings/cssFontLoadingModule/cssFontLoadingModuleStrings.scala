package typings.cssFontLoadingModule

import typings.cssFontLoadingModule.mod.FontFaceLoadStatus
import typings.cssFontLoadingModule.mod.FontFaceSetLoadStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssFontLoadingModuleStrings {
  
  @js.native
  sealed trait error
    extends StObject
       with FontFaceLoadStatus
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait loaded
    extends StObject
       with FontFaceLoadStatus
       with FontFaceSetLoadStatus
  inline def loaded: loaded = "loaded".asInstanceOf[loaded]
  
  @js.native
  sealed trait loading
    extends StObject
       with FontFaceLoadStatus
       with FontFaceSetLoadStatus
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait loadingdone extends StObject
  inline def loadingdone: loadingdone = "loadingdone".asInstanceOf[loadingdone]
  
  @js.native
  sealed trait loadingerror extends StObject
  inline def loadingerror: loadingerror = "loadingerror".asInstanceOf[loadingerror]
  
  @js.native
  sealed trait unloaded
    extends StObject
       with FontFaceLoadStatus
  inline def unloaded: unloaded = "unloaded".asInstanceOf[unloaded]
}
