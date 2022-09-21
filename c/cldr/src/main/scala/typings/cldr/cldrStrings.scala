package typings.cldr

import typings.cldr.mod.CardinalOrOrdinal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cldrStrings {
  
  @js.native
  sealed trait cardinal
    extends StObject
       with CardinalOrOrdinal
  inline def cardinal: cardinal = "cardinal".asInstanceOf[cardinal]
  
  @js.native
  sealed trait date extends StObject
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait ordinal
    extends StObject
       with CardinalOrOrdinal
  inline def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  
  @js.native
  sealed trait time extends StObject
  inline def time: time = "time".asInstanceOf[time]
}
