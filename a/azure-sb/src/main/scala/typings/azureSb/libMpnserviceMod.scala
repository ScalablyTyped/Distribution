package typings.azureSb

import typings.azureSb.anon.Headers
import typings.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import typings.azureSb.mod.Azure.ServiceBus.ResponseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMpnserviceMod {
  
  @JSImport("azure-sb/lib/mpnservice", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MpnsService {
    def this(notificationHubService: typings.azureSb.libNotificationhubserviceMod.^) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.azureSb.libMpnserviceMod.Template because Already inherited */ trait FlipTileTemplate
    extends StObject
       with TileTemplate {
    
    var smallBackgroundImage: String
    
    var wideBackBackgroundImage: String
    
    var wideBackContent: String
    
    var wideBackgroundImage: String
  }
  object FlipTileTemplate {
    
    inline def apply(
      backBackgroundImage: String,
      backContent: String,
      backTitle: String,
      backgroundImage: String,
      count: String,
      id: String,
      smallBackgroundImage: String,
      title: String,
      wideBackBackgroundImage: String,
      wideBackContent: String,
      wideBackgroundImage: String
    ): FlipTileTemplate = {
      val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], smallBackgroundImage = smallBackgroundImage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wideBackBackgroundImage = wideBackBackgroundImage.asInstanceOf[js.Any], wideBackContent = wideBackContent.asInstanceOf[js.Any], wideBackgroundImage = wideBackgroundImage.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlipTileTemplate]
    }
    
    extension [Self <: FlipTileTemplate](x: Self) {
      
      inline def setSmallBackgroundImage(value: String): Self = StObject.set(x, "smallBackgroundImage", value.asInstanceOf[js.Any])
      
      inline def setWideBackBackgroundImage(value: String): Self = StObject.set(x, "wideBackBackgroundImage", value.asInstanceOf[js.Any])
      
      inline def setWideBackContent(value: String): Self = StObject.set(x, "wideBackContent", value.asInstanceOf[js.Any])
      
      inline def setWideBackgroundImage(value: String): Self = StObject.set(x, "wideBackgroundImage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MpnsService extends StObject {
    
    def createNativeRegistration(channel: String, tags: String, callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(channel: String, tags: String, options: js.Object, callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(channel: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(channel: String, tags: js.Array[String], options: js.Object, callback: ResponseCallback): Unit = js.native
    
    def createOrUpdateNativeRegistration(registrationId: String, channel: String, tags: String, callback: ResponseCallback): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateNativeRegistration(registrationId: String, channel: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: String,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: String,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    
    def createRawTemplateRegistration(channel: String, tags: String, template: String, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(channel: String, tags: String, template: String, options: js.Object, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(channel: String, tags: String, template: Template, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(channel: String, tags: String, template: Template, options: js.Object, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(channel: String, tags: js.Array[String], template: String, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(
      channel: String,
      tags: js.Array[String],
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createRawTemplateRegistration(channel: String, tags: js.Array[String], template: Template, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(
      channel: String,
      tags: js.Array[String],
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    
    def listRegistrationsByChannel(channel: String, callback: ResponseCallback): Unit = js.native
    def listRegistrationsByChannel(channel: String, options: ListNotificationHubsOptions, callback: ResponseCallback): Unit = js.native
    
    var notificationHubService: typings.azureSb.libNotificationhubserviceMod.^ = js.native
    
    def send(
      tags: String,
      payload: String,
      targetName: String,
      notificationClass: String,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: String,
      payload: String,
      targetName: String,
      notificationClass: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: String,
      payload: js.Object,
      targetName: String,
      notificationClass: String,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: String,
      payload: js.Object,
      targetName: String,
      notificationClass: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: js.Array[String],
      payload: String,
      targetName: String,
      notificationClass: String,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: js.Array[String],
      payload: String,
      targetName: String,
      notificationClass: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: js.Array[String],
      payload: js.Object,
      targetName: String,
      notificationClass: String,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: js.Array[String],
      payload: js.Object,
      targetName: String,
      notificationClass: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: String,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: String,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureSb.libMpnserviceMod.TileTemplate
    - typings.azureSb.libMpnserviceMod.FlipTileTemplate
    - typings.azureSb.libMpnserviceMod.ToastTemplate
  */
  trait Template extends StObject
  object Template {
    
    inline def FlipTileTemplate(
      backBackgroundImage: String,
      backContent: String,
      backTitle: String,
      backgroundImage: String,
      count: String,
      id: String,
      smallBackgroundImage: String,
      title: String,
      wideBackBackgroundImage: String,
      wideBackContent: String,
      wideBackgroundImage: String
    ): typings.azureSb.libMpnserviceMod.FlipTileTemplate = {
      val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], smallBackgroundImage = smallBackgroundImage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wideBackBackgroundImage = wideBackBackgroundImage.asInstanceOf[js.Any], wideBackContent = wideBackContent.asInstanceOf[js.Any], wideBackgroundImage = wideBackgroundImage.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureSb.libMpnserviceMod.FlipTileTemplate]
    }
    
    inline def TileTemplate(
      backBackgroundImage: String,
      backContent: String,
      backTitle: String,
      backgroundImage: String,
      count: String,
      id: String,
      title: String
    ): typings.azureSb.libMpnserviceMod.TileTemplate = {
      val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureSb.libMpnserviceMod.TileTemplate]
    }
    
    inline def ToastTemplate(text1: String, text2: String): typings.azureSb.libMpnserviceMod.ToastTemplate = {
      val __obj = js.Dynamic.literal(text1 = text1.asInstanceOf[js.Any], text2 = text2.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureSb.libMpnserviceMod.ToastTemplate]
    }
  }
  
  trait TileTemplate
    extends StObject
       with Template {
    
    var backBackgroundImage: String
    
    var backContent: String
    
    var backTitle: String
    
    var backgroundImage: String
    
    var count: String
    
    var id: String
    
    var title: String
  }
  object TileTemplate {
    
    inline def apply(
      backBackgroundImage: String,
      backContent: String,
      backTitle: String,
      backgroundImage: String,
      count: String,
      id: String,
      title: String
    ): TileTemplate = {
      val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileTemplate]
    }
    
    extension [Self <: TileTemplate](x: Self) {
      
      inline def setBackBackgroundImage(value: String): Self = StObject.set(x, "backBackgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackContent(value: String): Self = StObject.set(x, "backContent", value.asInstanceOf[js.Any])
      
      inline def setBackTitle(value: String): Self = StObject.set(x, "backTitle", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToastTemplate
    extends StObject
       with Template {
    
    var param: js.UndefOr[String] = js.undefined
    
    var text1: String
    
    var text2: String
  }
  object ToastTemplate {
    
    inline def apply(text1: String, text2: String): ToastTemplate = {
      val __obj = js.Dynamic.literal(text1 = text1.asInstanceOf[js.Any], text2 = text2.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastTemplate]
    }
    
    extension [Self <: ToastTemplate](x: Self) {
      
      inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      inline def setText1(value: String): Self = StObject.set(x, "text1", value.asInstanceOf[js.Any])
      
      inline def setText2(value: String): Self = StObject.set(x, "text2", value.asInstanceOf[js.Any])
    }
  }
}
