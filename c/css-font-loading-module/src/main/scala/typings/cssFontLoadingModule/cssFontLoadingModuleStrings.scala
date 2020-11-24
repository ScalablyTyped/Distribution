package typings.cssFontLoadingModule

import typings.cssFontLoadingModule.mod.FontFaceLoadStatus
import typings.cssFontLoadingModule.mod.FontFaceSetLoadStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssFontLoadingModuleStrings {
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def loaded: loaded = "loaded".asInstanceOf[loaded]
  
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  
  @scala.inline
  def loadingdone: loadingdone = "loadingdone".asInstanceOf[loadingdone]
  
  @scala.inline
  def loadingerror: loadingerror = "loadingerror".asInstanceOf[loadingerror]
  
  @scala.inline
  def unloaded: unloaded = "unloaded".asInstanceOf[unloaded]
  
  @js.native
  sealed trait error extends FontFaceLoadStatus
  
  @js.native
  sealed trait loaded
    extends FontFaceLoadStatus
       with FontFaceSetLoadStatus
  
  @js.native
  sealed trait loading
    extends FontFaceLoadStatus
       with FontFaceSetLoadStatus
  
  @js.native
  sealed trait loadingdone extends js.Object
  
  @js.native
  sealed trait loadingerror extends js.Object
  
  @js.native
  sealed trait unloaded extends FontFaceLoadStatus
}
