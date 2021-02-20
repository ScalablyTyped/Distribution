package typings.dashjs

import typings.dashjs.dashjsNumbers.`100`
import typings.dashjs.dashjsNumbers.`101`
import typings.dashjs.dashjsNumbers.`102`
import typings.dashjs.dashjsNumbers.`103`
import typings.dashjs.dashjsNumbers.`104`
import typings.dashjs.dashjsNumbers.`105`
import typings.dashjs.dashjsNumbers.`106`
import typings.dashjs.dashjsNumbers.`107`
import typings.dashjs.dashjsNumbers.`108`
import typings.dashjs.dashjsNumbers.`109`
import typings.dashjs.dashjsNumbers.`10`
import typings.dashjs.dashjsNumbers.`110`
import typings.dashjs.dashjsNumbers.`111`
import typings.dashjs.dashjsNumbers.`112`
import typings.dashjs.dashjsNumbers.`113`
import typings.dashjs.dashjsNumbers.`114`
import typings.dashjs.dashjsNumbers.`11`
import typings.dashjs.dashjsNumbers.`12`
import typings.dashjs.dashjsNumbers.`13`
import typings.dashjs.dashjsNumbers.`14`
import typings.dashjs.dashjsNumbers.`15`
import typings.dashjs.dashjsNumbers.`16`
import typings.dashjs.dashjsNumbers.`17`
import typings.dashjs.dashjsNumbers.`18`
import typings.dashjs.dashjsNumbers.`19`
import typings.dashjs.dashjsNumbers.`200`
import typings.dashjs.dashjsNumbers.`20`
import typings.dashjs.dashjsNumbers.`21`
import typings.dashjs.dashjsNumbers.`22`
import typings.dashjs.dashjsNumbers.`23`
import typings.dashjs.dashjsNumbers.`24`
import typings.dashjs.dashjsNumbers.`25`
import typings.dashjs.dashjsNumbers.`27`
import typings.dashjs.dashjsNumbers.`28`
import typings.dashjs.dashjsNumbers.`29`
import typings.dashjs.dashjsNumbers.`31`
import typings.dashjs.dashjsNumbers.`32`
import typings.dashjs.dashjsNumbers.`33`
import typings.dashjs.dashjsNumbers.`34`
import typings.dashjs.dashjsNumbers.`35`
import typings.dashjs.mod.SessionToken
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Align extends StObject {
    
    var align: js.UndefOr[String] = js.native
    
    var line: js.UndefOr[String] = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[String] = js.native
  }
  object Align {
    
    @scala.inline
    def apply(): Align = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait Cc extends StObject {
    
    var cc: String = js.native
    
    var id: String = js.native
    
    var message: String = js.native
  }
  object Cc {
    
    @scala.inline
    def apply(cc: String, id: String, message: String): Cc = {
      val __obj = js.Dynamic.literal(cc = cc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cc]
    }
    
    @scala.inline
    implicit class CcMutableBuilder[Self <: Cc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCc(value: String): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Code extends StObject {
    
    var code: `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` | `24` | `25` | `27` | `28` | `29` | `31` | `32` | `33` | `34` | `35` | `100` | `101` | `102` | `103` | `104` | `105` | `106` | `107` | `108` | `109` | `110` | `111` | `112` | `113` | `114` | `200` = js.native
    
    var data: js.Object = js.native
    
    var message: String = js.native
  }
  object Code {
    
    @scala.inline
    def apply(
      code: `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` | `24` | `25` | `27` | `28` | `29` | `31` | `32` | `33` | `34` | `35` | `100` | `101` | `102` | `103` | `104` | `105` | `106` | `107` | `108` | `109` | `110` | `111` | `112` | `113` | `114` | `200`,
      data: js.Object,
      message: String
    ): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(
        value: `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` | `24` | `25` | `27` | `28` | `29` | `31` | `32` | `33` | `34` | `35` | `100` | `101` | `102` | `103` | `104` | `105` | `106` | `107` | `108` | `109` | `110` | `111` | `112` | `113` | `114` | `200`
      ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DroppedFrames extends StObject {
    
    var droppedFrames: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object DroppedFrames {
    
    @scala.inline
    def apply(): DroppedFrames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DroppedFrames]
    }
    
    @scala.inline
    implicit class DroppedFramesMutableBuilder[Self <: DroppedFrames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDroppedFrames(value: Double): Self = StObject.set(x, "droppedFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDroppedFramesUndefined: Self = StObject.set(x, "droppedFrames", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object End {
    
    @scala.inline
    def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Event extends StObject {
    
    var event: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var manifest: js.UndefOr[js.Object] = js.native
    
    var message: String = js.native
  }
  object Event {
    
    @scala.inline
    def apply(id: String, message: String): Event = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifest(value: js.Object): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var request: XMLHttpRequest = js.native
    
    var url: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, request: XMLHttpRequest, url: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageType extends StObject {
    
    var messageType: String = js.native
    
    var sessionToken: SessionToken = js.native
  }
  object MessageType {
    
    @scala.inline
    def apply(messageType: String, sessionToken: SessionToken): MessageType = {
      val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageType]
    }
    
    @scala.inline
    implicit class MessageTypeMutableBuilder[Self <: MessageType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionToken(value: SessionToken): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ P in std.MediaKeyMessageType ]: string} */
  @js.native
  trait PinMediaKeyMessageTypestr extends StObject {
    
    var `individualization-request`: String = js.native
    
    var `license-release`: String = js.native
    
    var `license-renewal`: String = js.native
    
    var `license-request`: String = js.native
  }
  object PinMediaKeyMessageTypestr {
    
    @scala.inline
    def apply(
      `individualization-request`: String,
      `license-release`: String,
      `license-renewal`: String,
      `license-request`: String
    ): PinMediaKeyMessageTypestr = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("individualization-request")(`individualization-request`.asInstanceOf[js.Any])
      __obj.updateDynamic("license-release")(`license-release`.asInstanceOf[js.Any])
      __obj.updateDynamic("license-renewal")(`license-renewal`.asInstanceOf[js.Any])
      __obj.updateDynamic("license-request")(`license-request`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinMediaKeyMessageTypestr]
    }
    
    @scala.inline
    implicit class PinMediaKeyMessageTypestrMutableBuilder[Self <: PinMediaKeyMessageTypestr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setIndividualization-request`(value: String): Self = StObject.set(x, "individualization-request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLicense-release`(value: String): Self = StObject.set(x, "license-release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLicense-renewal`(value: String): Self = StObject.set(x, "license-renewal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLicense-request`(value: String): Self = StObject.set(x, "license-request", value.asInstanceOf[js.Any])
    }
  }
}
