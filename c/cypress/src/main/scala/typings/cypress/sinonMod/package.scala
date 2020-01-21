package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sinonMod {
  type SinonStatic = typings.cypress.sinonMod.SinonSandbox with typings.cypress.sinonMod.LegacySandbox with typings.cypress.sinonMod.SinonApi
  /**
    * An instance of a stubbed object type with functions replaced by stubs.
    *
    * @template TType Object type being stubbed.
    */
  type SinonStubbedInstance[TType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TType ]: cypress.cypress/types/sinon.SinonStubbedMember<TType[P]>}
    */ typings.cypress.cypressStrings.SinonStubbedInstance with TType
  /**
    * Replaces a type with a Sinon stub if it's a function.
    */
  type SinonStubbedMember[T] = T | typings.cypress.sinonMod.SinonStub
  type SinonTimerId = scala.Double | typings.cypress.AnonId
  /**
    * Stubbed type of an object with members replaced by stubs.
    *
    * @template TType Type being stubbed.
    */
  type StubbableType[TType] = js.Function with js.Object
}
