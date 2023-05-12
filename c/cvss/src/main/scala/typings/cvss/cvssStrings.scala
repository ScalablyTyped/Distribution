package typings.cvss

import typings.cvss.mod.CVSSRating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cvssStrings {
  
  @js.native
  sealed trait Critical
    extends StObject
       with CVSSRating
  inline def Critical: Critical = "Critical".asInstanceOf[Critical]
  
  @js.native
  sealed trait High
    extends StObject
       with CVSSRating
  inline def High: High = "High".asInstanceOf[High]
  
  @js.native
  sealed trait Low
    extends StObject
       with CVSSRating
  inline def Low: Low = "Low".asInstanceOf[Low]
  
  @js.native
  sealed trait Medium
    extends StObject
       with CVSSRating
  inline def Medium: Medium = "Medium".asInstanceOf[Medium]
  
  @js.native
  sealed trait None
    extends StObject
       with CVSSRating
  inline def None: None = "None".asInstanceOf[None]
}
