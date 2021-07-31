package typings.cybozulabsMd5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CybozuLabs {
    
    object MD5 {
      
      @JSGlobal("CybozuLabs.MD5")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("CybozuLabs.MD5.BY_ASCII")
      @js.native
      def BY_ASCII: Double = js.native
      @scala.inline
      def BY_ASCII_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BY_ASCII")(x.asInstanceOf[js.Any])
      
      @JSGlobal("CybozuLabs.MD5.BY_UTF16")
      @js.native
      def BY_UTF16: Double = js.native
      @scala.inline
      def BY_UTF16_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BY_UTF16")(x.asInstanceOf[js.Any])
      
      @JSGlobal("CybozuLabs.MD5.VERSION")
      @js.native
      def VERSION: String = js.native
      @scala.inline
      def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def calc(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calc")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      @scala.inline
      def calc(str: String, option: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(str.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
    }
  }
}
