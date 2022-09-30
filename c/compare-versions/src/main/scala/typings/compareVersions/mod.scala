package typings.compareVersions

import typings.compareVersions.compareVersionsInts.`-1`
import typings.compareVersions.compareVersionsInts.`0`
import typings.compareVersions.compareVersionsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compare-versions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(v1: String, v2: String, operator: CompareOperator): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compareVersions(v1: String, v2: String): `1` | `-1` | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareVersions")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `-1` | `0`]
  
  inline def satisfies(version: String, range: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validate(version: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(version.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.compareVersions.compareVersionsStrings.Greaterthansign
    - typings.compareVersions.compareVersionsStrings.GreaterthansignEqualssign
    - typings.compareVersions.compareVersionsStrings.Equalssign
    - typings.compareVersions.compareVersionsStrings.Lessthansign
    - typings.compareVersions.compareVersionsStrings.LessthansignEqualssign
  */
  trait CompareOperator extends StObject
  object CompareOperator {
    
    inline def Equalssign: typings.compareVersions.compareVersionsStrings.Equalssign = "=".asInstanceOf[typings.compareVersions.compareVersionsStrings.Equalssign]
    
    inline def Greaterthansign: typings.compareVersions.compareVersionsStrings.Greaterthansign = ">".asInstanceOf[typings.compareVersions.compareVersionsStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typings.compareVersions.compareVersionsStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.compareVersions.compareVersionsStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typings.compareVersions.compareVersionsStrings.Lessthansign = "<".asInstanceOf[typings.compareVersions.compareVersionsStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typings.compareVersions.compareVersionsStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.compareVersions.compareVersionsStrings.LessthansignEqualssign]
  }
}
