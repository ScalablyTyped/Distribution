package typings.ckeditorCkeditor5Watchdog

import typings.ckeditorCkeditor5Watchdog.anon.Create
import typings.ckeditorCkeditor5Watchdog.anon.`0`
import typings.ckeditorCkeditor5Watchdog.srcContextwatchdogMod.default
import typings.ckeditorCkeditor5Watchdog.srcWatchdogMod.WatchdogConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-watchdog", "ContextWatchdog")
  @js.native
  open class ContextWatchdog[TContext /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any */] protected () extends default[TContext] {
    /**
      * The context watchdog class constructor.
      *
      * ```ts
      * const watchdog = new ContextWatchdog( Context );
      *
      * await watchdog.create( contextConfiguration );
      *
      * await watchdog.add( item );
      * ```
      *
      * See the {@glink features/watchdog Watchdog feature guide} to learn more how to use this feature.
      *
      * @param Context The {@link module:core/context~Context} class.
      * @param watchdogConfig The watchdog configuration.
      */
    def this(Context: Create[TContext]) = this()
    def this(Context: Create[TContext], watchdogConfig: WatchdogConfig) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-watchdog", "EditorWatchdog")
  @js.native
  /**
    * @param Editor The editor class.
    * @param watchdogConfig The watchdog plugin configuration.
    */
  open class EditorWatchdog[TEditor /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any */] ()
    extends typings.ckeditorCkeditor5Watchdog.srcEditorwatchdogMod.default[TEditor] {
    def this(Editor: `0`[TEditor]) = this()
    def this(Editor: Null, watchdogConfig: WatchdogConfig) = this()
    def this(Editor: `0`[TEditor], watchdogConfig: WatchdogConfig) = this()
  }
  
  /* note: abstract class */ @JSImport("@ckeditor/ckeditor5-watchdog", "Watchdog")
  @js.native
  open class Watchdog protected ()
    extends typings.ckeditorCkeditor5Watchdog.srcWatchdogMod.default {
    /**
      * @param {module:watchdog/watchdog~WatchdogConfig} config The watchdog plugin configuration.
      */
    def this(config: WatchdogConfig) = this()
  }
}
