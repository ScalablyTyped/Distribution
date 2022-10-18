package typings.contentstackUtils

import typings.contentstackUtils.distTypesModelsEmbeddedObjectMod.EmbeddedItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEntryEditableMod {
  
  @JSImport("@contentstack/utils/dist/types/entry-editable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTags(entry: EmbeddedItem, contentTypeUid: String, tagsAsObject: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTags")(entry.asInstanceOf[js.Any], contentTypeUid.asInstanceOf[js.Any], tagsAsObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTags(entry: EmbeddedItem, contentTypeUid: String, tagsAsObject: Boolean, locale: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTags")(entry.asInstanceOf[js.Any], contentTypeUid.asInstanceOf[js.Any], tagsAsObject.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
