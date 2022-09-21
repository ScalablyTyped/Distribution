package typings.cordovaPluginMedia

import typings.std.MediaError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Media")
  @js.native
  open class Media protected ()
    extends StObject
       with typings.cordovaPluginMedia.Media {
    def this(src: String, mediaSuccess: js.Function0[Unit]) = this()
    def this(
      src: String,
      mediaSuccess: js.Function0[Unit],
      mediaError: js.Function1[/* error */ MediaError, Any]
    ) = this()
    def this(
      src: String,
      mediaSuccess: js.Function0[Unit],
      mediaError: js.Function1[/* error */ MediaError, Any],
      mediaStatus: js.Function1[/* status */ Double, Unit]
    ) = this()
    def this(
      src: String,
      mediaSuccess: js.Function0[Unit],
      mediaError: Unit,
      mediaStatus: js.Function1[/* status */ Double, Unit]
    ) = this()
  }
  object Media {
    
    @JSGlobal("Media")
    @js.native
    val ^ : js.Any = js.native
    
    //Media statuses
    @JSGlobal("Media.MEDIA_NONE")
    @js.native
    def MEDIA_NONE: Double = js.native
    inline def MEDIA_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_NONE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Media.MEDIA_PAUSED")
    @js.native
    def MEDIA_PAUSED: Double = js.native
    inline def MEDIA_PAUSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_PAUSED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Media.MEDIA_RUNNING")
    @js.native
    def MEDIA_RUNNING: Double = js.native
    inline def MEDIA_RUNNING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_RUNNING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Media.MEDIA_STARTING")
    @js.native
    def MEDIA_STARTING: Double = js.native
    inline def MEDIA_STARTING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_STARTING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Media.MEDIA_STOPPED")
    @js.native
    def MEDIA_STOPPED: Double = js.native
    inline def MEDIA_STOPPED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_STOPPED")(x.asInstanceOf[js.Any])
  }
}
