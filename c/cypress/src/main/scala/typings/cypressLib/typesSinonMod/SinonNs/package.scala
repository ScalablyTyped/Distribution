package typings
package cypressLib.typesSinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SinonNs {
  type SinonStatic = SinonSandbox with LegacySandbox with SinonApi
  /**
    * An instance of a stubbed object type with functions replaced by stubs.
    *
    * @template TType Object type being stubbed.
    */
  type SinonStubbedInstance[TType] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof TType ]: cypress.cypress/types/sinon.Sinon.SinonStubbedMember<TType[P]>}
    */ cypressLib.cypressLibStrings.SinonStubbedInstance with TType
  /**
    * Replaces a type with a Sinon stub if it's a function.
    */
  type SinonStubbedMember[T] = T | SinonStub
  type SinonTimerId = scala.Double | cypressLib.Anon_Id
  /**
    * Stubbed type of an object with members replaced by stubs.
    *
    * @template TType Type being stubbed.
    */
  type StubbableType[TType] = js.Function with js.Object
}
