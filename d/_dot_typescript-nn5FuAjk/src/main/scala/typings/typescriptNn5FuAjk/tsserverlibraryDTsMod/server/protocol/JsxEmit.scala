package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxEmit extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.protocol.JsxEmit")
@js.native
object JsxEmit extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JsxEmit & String] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with JsxEmit
  /* "None" */ val None: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.JsxEmit.None & String = js.native
  
  @js.native
  sealed trait Preserve
    extends StObject
       with JsxEmit
  /* "Preserve" */ val Preserve: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.JsxEmit.Preserve & String = js.native
  
  @js.native
  sealed trait React
    extends StObject
       with JsxEmit
  /* "React" */ val React: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.JsxEmit.React & String = js.native
  
  @js.native
  sealed trait ReactNative
    extends StObject
       with JsxEmit
  /* "ReactNative" */ val ReactNative: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.JsxEmit.ReactNative & String = js.native
}
