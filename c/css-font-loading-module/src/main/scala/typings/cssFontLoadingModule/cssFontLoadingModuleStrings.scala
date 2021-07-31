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
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait loaded
    extends StObject
       with FontFaceLoadStatus
       with FontFaceSetLoadStatus
  @scala.inline
  def loaded: loaded = "loaded".asInstanceOf[loaded]
  
  @js.native
  sealed trait loading
    extends StObject
       with FontFaceLoadStatus
       with FontFaceSetLoadStatus
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait loadingdone extends StObject
  @scala.inline
  def loadingdone: loadingdone = "loadingdone".asInstanceOf[loadingdone]
  
  @js.native
  sealed trait loadingerror extends StObject
  @scala.inline
  def loadingerror: loadingerror = "loadingerror".asInstanceOf[loadingerror]
  
  @js.native
  sealed trait unloaded
    extends StObject
       with FontFaceLoadStatus
  @scala.inline
  def unloaded: unloaded = "unloaded".asInstanceOf[unloaded]
}
