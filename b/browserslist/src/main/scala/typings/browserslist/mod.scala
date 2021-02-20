package typings.browserslist

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.browserslist.browserslistStrings.`my stats`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("browserslist", JSImport.Namespace)
  @js.native
  val ^ : Browserslist = js.native
  
  @js.native
  trait Browserslist extends StObject {
    
    def apply(): js.Array[String] = js.native
    def apply(queries: js.UndefOr[scala.Nothing], opts: Options): js.Array[String] = js.native
    def apply(queries: String): js.Array[String] = js.native
    def apply(queries: String, opts: Options): js.Array[String] = js.native
    def apply(queries: js.Array[String]): js.Array[String] = js.native
    def apply(queries: js.Array[String], opts: Options): js.Array[String] = js.native
    
    def clearCaches(): Unit = js.native
    
    /** Return browsers market coverage */
    def coverage(browsers: js.Array[String]): Double = js.native
    def coverage(browsers: js.Array[String], stats: StatsOptions): Double = js.native
  }
  
  /** statistics from `Browserslist` files */
  type MyStats = `my stats`
  
  @js.native
  trait Options extends StObject {
    
    /** path to config if you want to set it manually */
    var config: js.UndefOr[String] = js.native
    
    /** Disable security checks for extend query.  */
    var dangerousExtend: js.UndefOr[Boolean] = js.native
    
    /** what environment section use from config */
    var env: js.UndefOr[String] = js.native
    
    /** do not throw on direct query (like ie 12). */
    var ignoreUnknownVersions: js.UndefOr[Boolean] = js.native
    
    /** Use desktop browsers if Can I Use doesn’t have data about this mobile version */
    var mobileToDesktop: js.UndefOr[Boolean] = js.native
    
    /** file or a directory path to look for config file */
    var path: js.UndefOr[String] = js.native
    
    /** custom usage statistics data */
    var stats: js.UndefOr[Stats] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setDangerousExtend(value: Boolean): Self = StObject.set(x, "dangerousExtend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerousExtendUndefined: Self = StObject.set(x, "dangerousExtend", js.undefined)
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setIgnoreUnknownVersions(value: Boolean): Self = StObject.set(x, "ignoreUnknownVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUnknownVersionsUndefined: Self = StObject.set(x, "ignoreUnknownVersions", js.undefined)
      
      @scala.inline
      def setMobileToDesktop(value: Boolean): Self = StObject.set(x, "mobileToDesktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileToDesktopUndefined: Self = StObject.set(x, "mobileToDesktop", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  type Stats = StringDictionary[StringDictionary[Double]]
  
  /**
    * Which statistics should be used.
    * Country code or custom statistics.
    * Pass `"my stats"` to load statistics
    * from `Browserslist` files
    */
  type StatsOptions = String | MyStats | Stats
  
  type _To = Browserslist
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Browserslist = ^
}
