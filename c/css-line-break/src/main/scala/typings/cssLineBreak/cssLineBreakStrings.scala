package typings.cssLineBreak

import typings.cssLineBreak.distTypesLineBreakMod.LINE_BREAK
import typings.cssLineBreak.distTypesLineBreakMod.WORD_BREAK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssLineBreakStrings {
  
  @js.native
  sealed trait auto
    extends StObject
       with LINE_BREAK
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait `break-all`
    extends StObject
       with WORD_BREAK
  inline def `break-all`: `break-all` = "break-all".asInstanceOf[`break-all`]
  
  @js.native
  sealed trait `break-word`
    extends StObject
       with WORD_BREAK
  inline def `break-word`: `break-word` = "break-word".asInstanceOf[`break-word`]
  
  @js.native
  sealed trait `keep-all`
    extends StObject
       with WORD_BREAK
  inline def `keep-all`: `keep-all` = "keep-all".asInstanceOf[`keep-all`]
  
  @js.native
  sealed trait normal
    extends StObject
       with LINE_BREAK
       with WORD_BREAK
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait strict
    extends StObject
       with LINE_BREAK
  inline def strict: strict = "strict".asInstanceOf[strict]
}
