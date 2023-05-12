package typings.cucumberCucumber

import typings.cucumberMessages.distCjsSrcMessagesMod.AttachmentContentEncoding
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeAttachmentManagerMod {
  
  @JSImport("@cucumber/cucumber/lib/runtime/attachment_manager", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AttachmentManager {
    def this(onAttachment: IAttachFunction) = this()
  }
  
  @js.native
  trait AttachmentManager extends StObject {
    
    def create(data: String): Unit | js.Promise[Unit] = js.native
    def create(data: String, mediaType: String): Unit | js.Promise[Unit] = js.native
    def create(data: String, mediaType: String, callback: js.Function0[Unit]): Unit | js.Promise[Unit] = js.native
    def create(data: String, mediaType: Unit, callback: js.Function0[Unit]): Unit | js.Promise[Unit] = js.native
    def create(data: Buffer): Unit | js.Promise[Unit] = js.native
    def create(data: Buffer, mediaType: String): Unit | js.Promise[Unit] = js.native
    def create(data: Buffer, mediaType: String, callback: js.Function0[Unit]): Unit | js.Promise[Unit] = js.native
    def create(data: Buffer, mediaType: Unit, callback: js.Function0[Unit]): Unit | js.Promise[Unit] = js.native
    def create(data: Readable): Unit | js.Promise[Unit] = js.native
    def create(data: Readable, mediaType: String): Unit | js.Promise[Unit] = js.native
    def create(data: Readable, mediaType: String, callback: js.Function0[Unit]): Unit | js.Promise[Unit] = js.native
    def create(data: Readable, mediaType: Unit, callback: js.Function0[Unit]): Unit | js.Promise[Unit] = js.native
    
    def createBufferAttachment(data: Buffer, mediaType: String): Unit = js.native
    
    def createStreamAttachment(data: Readable, mediaType: String, callback: js.Function0[Unit]): Unit | js.Promise[Unit] = js.native
    
    def createStringAttachment(data: String, media: IAttachmentMedia): Unit = js.native
    
    def log(text: String): Unit | js.Promise[Unit] = js.native
    
    /* private */ val onAttachment: Any = js.native
  }
  
  type IAttachFunction = js.Function1[/* attachment */ IAttachment, Unit]
  
  trait IAttachment extends StObject {
    
    var data: String
    
    var media: IAttachmentMedia
  }
  object IAttachment {
    
    inline def apply(data: String, media: IAttachmentMedia): IAttachment = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAttachment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAttachment] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: IAttachmentMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    }
  }
  
  trait IAttachmentMedia extends StObject {
    
    var contentType: String
    
    var encoding: AttachmentContentEncoding
  }
  object IAttachmentMedia {
    
    inline def apply(contentType: String, encoding: AttachmentContentEncoding): IAttachmentMedia = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAttachmentMedia]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAttachmentMedia] (val x: Self) extends AnyVal {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: AttachmentContentEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.cucumberCucumber.libRuntimeAttachmentManagerMod.ICreateStreamAttachment because Already inherited
  - typings.cucumberCucumber.libRuntimeAttachmentManagerMod.ICreateBufferAttachment because Already inherited */ @js.native
  trait ICreateAttachment
    extends ICreateStringAttachment
       with ICreateStreamAttachmentWithCallback {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* data */ String, arg2: /* mediaType */ js.UndefOr[String]): Unit = js.native
    /* InferMemberOverrides */
    override def apply(arg1: /* data */ Readable, arg2: /* mediaType */ String, arg3: /* callback */ js.Function0[Unit]): Unit = js.native
  }
  
  type ICreateBufferAttachment = js.Function2[/* data */ Buffer, /* mediaType */ String, Unit]
  
  type ICreateLog = js.Function1[/* text */ String, Unit]
  
  type ICreateStreamAttachment = js.Function2[/* data */ Readable, /* mediaType */ String, js.Promise[Unit]]
  
  type ICreateStreamAttachmentWithCallback = js.Function3[/* data */ Readable, /* mediaType */ String, /* callback */ js.Function0[Unit], Unit]
  
  type ICreateStringAttachment = js.Function2[/* data */ String, /* mediaType */ js.UndefOr[String], Unit]
}
