package typings.compareVersions

import typings.compareVersions.compareVersionsNumbers.`-1`
import typings.compareVersions.compareVersionsNumbers.`0`
import typings.compareVersions.compareVersionsNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compare [semver](https://semver.org/) version strings to find greater, equal or lesser.
    * This library supports the full semver specification, including comparing versions with different number of digits like `1.0.0`, `1.0`, `1`, and pre-release versions like `1.0.0-alpha`.
    * @param firstVersion - First version to compare
    * @param secondVersion - Second version to compare
    * @returns Numeric value compatible with the [Array.sort(fn) interface](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/sort#Parameters).
    */
  @JSImport("compare-versions", JSImport.Namespace)
  @js.native
  def apply(firstVersion: String, secondVersion: String): `1` | `0` | `-1` = js.native
  
  /**
    * Compare [semver](https://semver.org/) version strings using the specified operator.
    * 
    * @param firstVersion First version to compare
    * @param secondVersion Second version to compare
    * @param operator Allowed arithmetic operator to use
    * @returns `true` if the comparison between the firstVersion and the secondVersion satisfies the operator, `false` otherwise.
    *
    * @example
    * ```
    * compareVersions.compare('10.1.8', '10.0.4', '>'); // return true
    * compareVersions.compare('10.0.1', '10.0.1', '='); // return true
    * compareVersions.compare('10.1.1', '10.2.2', '<'); // return true
    * compareVersions.compare('10.1.1', '10.2.2', '<='); // return true
    * compareVersions.compare('10.1.1', '10.2.2', '>='); // return false
    * ```
    */
  @JSImport("compare-versions", "compare")
  @js.native
  def compare(firstVersion: String, secondVersion: String, operator: CompareOperator): Boolean = js.native
  
  /**
    * Validate [semver](https://semver.org/) version strings.
    * 
    * @param version Version number to validate
    * @returns `true` if the version number is a valid semver version number, `false` otherwise.
    *
    * @example
    * ```
    * compareVersions.validate('1.0.0-rc.1'); // return true
    * compareVersions.validate('1.0-rc.1'); // return false
    * compareVersions.validate('foo'); // return false
    * ```
    */
  @JSImport("compare-versions", "validate")
  @js.native
  def validate(version: String): Boolean = js.native
  
  /**
    * Allowed arithmetic operators
    */
  /* Rewritten from type alias, can be one of: 
    - typings.compareVersions.compareVersionsStrings.Greaterthansign
    - typings.compareVersions.compareVersionsStrings.GreaterthansignEqualssign
    - typings.compareVersions.compareVersionsStrings.Equalssign
    - typings.compareVersions.compareVersionsStrings.Lessthansign
    - typings.compareVersions.compareVersionsStrings.LessthansignEqualssign
  */
  trait CompareOperator extends StObject
  object CompareOperator {
    
    @scala.inline
    def Equalssign: typings.compareVersions.compareVersionsStrings.Equalssign = "=".asInstanceOf[typings.compareVersions.compareVersionsStrings.Equalssign]
    
    @scala.inline
    def Greaterthansign: typings.compareVersions.compareVersionsStrings.Greaterthansign = ">".asInstanceOf[typings.compareVersions.compareVersionsStrings.Greaterthansign]
    
    @scala.inline
    def GreaterthansignEqualssign: typings.compareVersions.compareVersionsStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.compareVersions.compareVersionsStrings.GreaterthansignEqualssign]
    
    @scala.inline
    def Lessthansign: typings.compareVersions.compareVersionsStrings.Lessthansign = "<".asInstanceOf[typings.compareVersions.compareVersionsStrings.Lessthansign]
    
    @scala.inline
    def LessthansignEqualssign: typings.compareVersions.compareVersionsStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.compareVersions.compareVersionsStrings.LessthansignEqualssign]
  }
}
