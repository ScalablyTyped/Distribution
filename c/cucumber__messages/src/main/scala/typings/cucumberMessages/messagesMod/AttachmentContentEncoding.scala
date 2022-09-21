package typings.cucumberMessages.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttachmentContentEncoding extends StObject
@JSImport("@cucumber/messages/dist/cjs/src/messages", "AttachmentContentEncoding")
@js.native
object AttachmentContentEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AttachmentContentEncoding & String] = js.native
  
  @js.native
  sealed trait BASE64
    extends StObject
       with AttachmentContentEncoding
  /* "BASE64" */ val BASE64: typings.cucumberMessages.messagesMod.AttachmentContentEncoding.BASE64 & String = js.native
  
  @js.native
  sealed trait IDENTITY
    extends StObject
       with AttachmentContentEncoding
  /* "IDENTITY" */ val IDENTITY: typings.cucumberMessages.messagesMod.AttachmentContentEncoding.IDENTITY & String = js.native
}
