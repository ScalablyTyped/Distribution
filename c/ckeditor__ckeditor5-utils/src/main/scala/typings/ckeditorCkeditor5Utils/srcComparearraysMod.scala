package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComparearraysMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/comparearrays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: js.Array[Any], b: js.Array[Any]): ArrayRelation | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[ArrayRelation | Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.`extension`
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.same
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.prefix
  */
  trait ArrayRelation extends StObject
  object ArrayRelation {
    
    inline def `extension`: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.`extension` = "extension".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.`extension`]
    
    inline def prefix: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.prefix = "prefix".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.prefix]
    
    inline def same: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.same = "same".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.same]
  }
}
