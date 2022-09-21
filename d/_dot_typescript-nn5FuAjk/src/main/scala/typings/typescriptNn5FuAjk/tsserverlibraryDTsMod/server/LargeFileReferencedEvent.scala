package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LargeFileReferencedEvent
  extends StObject
     with ProjectServiceEvent {
  
  var data: File
  
  var eventName: /* "largeFileReferenced" */ String
}
object LargeFileReferencedEvent {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.LargeFileReferencedEvent")
  @js.native
  val ^ : /* "largeFileReferenced" */ String = js.native
  
  extension [Self <: LargeFileReferencedEvent](x: Self) {
    
    inline def setData(value: File): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: /* "largeFileReferenced" */ String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
  }
}
