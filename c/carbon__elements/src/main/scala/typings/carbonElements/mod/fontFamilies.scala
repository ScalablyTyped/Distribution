package typings.carbonElements.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontFamilies {
  
  @JSImport("@carbon/elements", "fontFamilies")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@carbon/elements", "fontFamilies.mono")
  @js.native
  def mono: /* 'IBM Plex Mono', 'Menlo', 'DejaVu Sans Mono', 'Bitstream Vera Sans Mono', Courier, monospace */ String = js.native
  inline def mono_=(
    x: /* 'IBM Plex Mono', 'Menlo', 'DejaVu Sans Mono', 'Bitstream Vera Sans Mono', Courier, monospace */ String
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mono")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "fontFamilies.sans")
  @js.native
  def sans: /* 'IBM Plex Sans', 'Helvetica Neue', Arial, sans-serif */ String = js.native
  
  @JSImport("@carbon/elements", "fontFamilies.sansCondensed")
  @js.native
  def sansCondensed: /* 'IBM Plex Sans Condensed', 'Helvetica Neue', Arial, sans-serif */ String = js.native
  inline def sansCondensed_=(x: /* 'IBM Plex Sans Condensed', 'Helvetica Neue', Arial, sans-serif */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sansCondensed")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "fontFamilies.sansHebrew")
  @js.native
  def sansHebrew: /* 'IBM Plex Sans Hebrew', 'Helvetica Hebrew', 'Arial Hebrew', sans-serif */ String = js.native
  inline def sansHebrew_=(x: /* 'IBM Plex Sans Hebrew', 'Helvetica Hebrew', 'Arial Hebrew', sans-serif */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sansHebrew")(x.asInstanceOf[js.Any])
  
  inline def sans_=(x: /* 'IBM Plex Sans', 'Helvetica Neue', Arial, sans-serif */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sans")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "fontFamilies.serif")
  @js.native
  def serif: /* 'IBM Plex Serif', 'Georgia', Times, serif */ String = js.native
  inline def serif_=(x: /* 'IBM Plex Serif', 'Georgia', Times, serif */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serif")(x.asInstanceOf[js.Any])
}
