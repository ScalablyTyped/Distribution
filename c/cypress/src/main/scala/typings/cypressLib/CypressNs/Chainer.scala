package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Kind of onerous, but has a nice auto-complete. Also fallbacks at the end for custom stuff
/**
  * @see https://on.cypress.io/should
  *
  * @interface Chainer
  * @template Subject
  */
@js.native
trait Chainer[Subject] extends js.Object {
  /**
    * Asserts that the target matches the given regular expression `re`.
    * @example
    *    cy.wrap('foobar').should('match', /^foo/)
    * @see http://chaijs.com/api/bdd/#method_match
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.`match`, value: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.`match`, value: stdLib.RegExp): Chainable[Subject] = js.native
  /**
    * When no arguments are provided, `.throw` invokes the target function and asserts that an error is thrown.
    * When one argument is provided, and it’s a string, `.throw` invokes the target function and asserts that an error is thrown with a message that contains that string.
    * @example
    *    function badFn() { throw new TypeError('Illegal salmon!') }
    *    cy.wrap(badFn).should('throw')
    *    cy.wrap(badFn).should('throw', 'salmon')
    *    cy.wrap(badFn).should('throw', /salmon/)
    * @see http://chaijs.com/api/bdd/#method_throw
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.`throw`): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.`throw`, error: js.Function): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.`throw`, error: js.Function, expected: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.`throw`, error: js.Function, expected: stdLib.RegExp): Chainable[Subject] = js.native
  /**
    * When no arguments are provided, `.throw` invokes the target function and asserts that an error is thrown.
    * When one argument is provided, and it’s a string, `.throw` invokes the target function and asserts that an error is thrown with a message that contains that string.
    * @example
    *    function badFn() { throw new TypeError('Illegal salmon!') }
    *    cy.wrap(badFn).should('throw')
    *    cy.wrap(badFn).should('throw', 'salmon')
    *    cy.wrap(badFn).should('throw', /salmon/)
    * @see http://chaijs.com/api/bdd/#method_throw
    * @see https://on.cypress.io/assertions
    */
  // tslint:disable-next-line ban-types
  def apply(chainer: cypressLib.cypressLibStrings.`throw`, error: nodeLib.Error): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.`throw`, error: nodeLib.Error, expected: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.`throw`, error: nodeLib.Error, expected: stdLib.RegExp): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.`throw`, value: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.`throw`, value: stdLib.RegExp): Chainable[Subject] = js.native
  /**
    * Assert spy always returned the provided value.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwaysreturnedobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.alwaysDOTreturned, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.above', 5)
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTabove, value: scala.Double): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.beDOTabove, value: stdLib.Date): Chainable[Subject] = js.native
  /**
    * Assert if spy was always called with matching arguments (and possibly others).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwayscalledwithmatcharg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTalwaysDOTcalledWithMatch, args: js.Any*): Chainable[Subject] = js.native
  // sinon-chai
  /**
    * Assert spy/stub was called the `new` operator.
    * Beware that this is inferred based on the value of the this object and the spy function’s prototype, so it may give false positives if you actively return the right kind of object.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithnew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTalwaysDOTcalledWithNew): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `type` is equal to the given string type.
    * Types are case insensitive. See the `type-detect` project page for info on the type detection algorithm:
    * https://github.com/chaijs/type-detect.
    * @example
    *    cy.wrap({ foo: 'bar' }).should('be.an', 'object')
    * @alias a
    * @see http://chaijs.com/api/bdd/#method_a
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTan, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number that’s within a given +/- `delta` range of the given number `expected`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(5.1).should('be.approximately', 5, 0.5)
    * @alias closeTo
    * @see http://chaijs.com/api/bdd/#method_closeto
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTapproximately, value: scala.Double, delta: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is an `arguments` object.
    * @example
    *    cy.wrap(arguments).should('be.arguments')
    * @see http://chaijs.com/api/bdd/#method_arguments
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTarguments): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a `n` date greater than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.at.least', 5)
    * @see http://chaijs.com/api/bdd/#method_least
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTatDOTleast, value: scala.Double): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.beDOTatDOTleast, value: stdLib.Date): Chainable[Subject] = js.native
  // chai
  /**
    * Asserts that the target’s `type` is equal to the given string type.
    * Types are case insensitive. See the `type-detect` project page for info on the type detection algorithm:
    * https://github.com/chaijs/type-detect.
    * @example
    *    cy.wrap('foo').should('be.a', 'string')
    * @see http://chaijs.com/api/bdd/#method_a
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTa, `type`: java.lang.String): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('be.below', 5)
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTbelow, value: scala.Double): Chainable[Subject] = js.native
  /**
    * `true` if the spy was called at least once
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTcalled): Chainable[Subject] = js.native
  /**
    * Assert spy was called after `anotherSpy`
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledafteranotherspy
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTcalledAfter, spy: sinonLib.sinonMod.SinonNs.SinonSpy): Chainable[Subject] = js.native
  /**
    * Assert spy was called before `anotherSpy`
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledbeforeanotherspy
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTcalledBefore, spy: sinonLib.sinonMod.SinonNs.SinonSpy): Chainable[Subject] = js.native
  /**
    * Assert spy was called exactly once
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledonce
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTcalledOnce): Chainable[Subject] = js.native
  /**
    * Assert spy was called at least once with `obj` as `this`. `calledOn` also accepts a matcher (see [matchers](http://sinonjs.org/releases/v4.1.3/spies/#matchers)).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledonobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTcalledOn, context: js.Any): Chainable[Subject] = js.native
  /**
    * Assert spy was called exactly three times
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledthrice
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTcalledThrice): Chainable[Subject] = js.native
  /**
    * Assert spy was called exactly twice
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledtwice
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTcalledTwice): Chainable[Subject] = js.native
  /**
    * Assert spy was called at least once with the provided arguments and no others.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithexactlyarg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTcalledWithExactly, args: js.Any*): Chainable[Subject] = js.native
  /**
    * Assert spy was called with matching arguments (and possibly others).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithmatcharg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTcalledWithMatch, args: js.Any*): Chainable[Subject] = js.native
  /**
    * Assert spy/stub was called the `new` operator.
    * Beware that this is inferred based on the value of the this object and the spy function’s prototype, so it may give false positives if you actively return the right kind of object.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithnew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTcalledWithNew): Chainable[Subject] = js.native
  // jquery-chai
  /**
    * Assert that at least one element of the selection is checked, using `.is(':checked')`.
    * @example
    *    cy.get('#result').should('be.checked')
    * @see http://chaijs.com/plugins/chai-jquery/#checked
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTchecked): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number that’s within a given +/- `delta` range of the given number `expected`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(5.1).should('be.closeTo', 5, 0.5)
    * @see http://chaijs.com/api/bdd/#method_closeto
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTcloseTo, value: scala.Double, delta: scala.Double): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is disabled, using `.is(':disabled')`.
    * @example
    *    cy.get('#result').should('be.disabled')
    * @see http://chaijs.com/plugins/chai-jquery/#disabled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTdisabled): Chainable[Subject] = js.native
  /**
    * When the target is a string or array, .empty asserts that the target’s length property is strictly (===) equal to 0
    * @example
    *    cy.wrap([]).should('be.empty')
    *    cy.wrap('').should('be.empty')
    * @see http://chaijs.com/api/bdd/#method_empty
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTempty): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is enabled, using `.is(':enabled')`.
    * @example
    *    cy.get('#result').should('be.enabled')
    * @see http://chaijs.com/plugins/chai-jquery/#enabled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTenabled): Chainable[Subject] = js.native
  /**
    * Asserts that the target is strictly (`===`) equal to `false`.
    * @example
    *    cy.wrap(false).should('be.false')
    * @see http://chaijs.com/api/bdd/#method_false
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTfalse): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.greaterThan', 5)
    * @alias above
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTgreaterThan, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a `n` date greater than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.gte', 5)
    * @alias least
    * @see http://chaijs.com/api/bdd/#method_least
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTgte, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.gt', 5)
    * @alias above
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTgt, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is hidden, using `.is(':hidden')`.
    * @example
    *    cy.get('#result').should('be.hidden')
    * @see http://chaijs.com/plugins/chai-jquery/#hidden
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOThidden): Chainable[Subject] = js.native
  /**
    * Asserts that the target is an instance of the given `constructor`.
    * @example
    *    cy.wrap([1, 2]).should('be.instanceOf', Array)
    * @see http://chaijs.com/api/bdd/#method_instanceof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTinstanceOf, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('be.lessThan', 5)
    * @alias below
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTlessThan, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('be.lte', 5)
    * @alias most
    * @see http://chaijs.com/api/bdd/#method_most
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTlte, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('be.lt', 5)
    * @alias below
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTlt, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is loosely (`==`) equal to `true`. However, it’s often best to assert that the target is strictly (`===`) or deeply equal to its expected value.
    * @example
    *    cy.wrap(1).should('be.ok')
    * @see http://chaijs.com/api/bdd/#method_ok
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTok): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is selected, using `.is(':selected')`.
    * @example
    *    cy.get('#result').should('be.selected')
    * @see http://chaijs.com/plugins/chai-jquery/#selected
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTselected): Chainable[Subject] = js.native
  /**
    * Asserts that the target is strictly (`===`) equal to true.
    * @example
    *    cy.wrap(true).should('be.true')
    * @see http://chaijs.com/api/bdd/#method_true
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTtrue): Chainable[Subject] = js.native
  /**
    * Asserts that the target is strictly (`===`) equal to undefined.
    * @example
    *    cy.wrap(undefined).should('be.undefined')
    * @see http://chaijs.com/api/bdd/#method_undefined
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTundefined): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is visible, using `.is(':visible')`.
    * @example
    *    cy.get('#result').should('be.visible')
    * @see http://chaijs.com/plugins/chai-jquery/#visible
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTvisible): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a date greater than or equal to the given number or date `start`, and less than or equal to the given number or date `finish` respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.within', 5, 10)
    * @see http://chaijs.com/api/bdd/#method_within
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.beDOTwithin, start: scala.Double, end: scala.Double): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.beDOTwithin, start: stdLib.Date, end: stdLib.Date): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.change` asserts that the given function `subject` returns a different value when it’s invoked before the target function compared to when it’s invoked afterward.
    * However, it’s often best to assert that `subject` is equal to its expected value.
    * @example
    *    let dots = ''
    *    function addDot() { dots += '.' }
    *    function getDots() { return dots }
    *    cy.wrap(addDot).should('change', getDots)
    * @see http://chaijs.com/api/bdd/#method_change
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.change, fn: js.Function1[/* repeated */ js.Any, _]): Chainable[Subject] = js.native
  /**
    * When two arguments are provided, `.change` asserts that the value of the given object `subject`'s `prop` property is different before invoking the target function compared to afterward.
    * @example
    *    const myObj = { dots: '' }
    *    function addDot() { myObj.dots += '.' }
    *    cy.wrap(addDot).should('change', myObj, 'dots')
    * @see http://chaijs.com/api/bdd/#method_change
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.change, obj: js.Object, prop: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert that the selection contains the given text, using `:contains()`. If the object asserted against is not a jQuery object, or if `contain` is not called as a function, the original implementation will be called.
    * @example
    *    cy.get('#result').should('contain', 'text')
    * @see http://chaijs.com/plugins/chai-jquery/#containtext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.contain, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string val is a substring of the target.
    * @example
    *    cy.wrap('tester').should('contain', 'test')
    * @alias include
    * @see http://chaijs.com/api/bdd/#method_include
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.contain, value: js.Any): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.decrease` asserts that the given function `subject` returns a lesser number when it’s invoked after invoking the target function compared to when it’s invoked beforehand.
    * `.decrease` also causes all `.by` assertions that follow in the chain to assert how much lesser of a number is returned. It’s often best to assert that the return value decreased by the expected amount, rather than asserting it decreased by any amount.
    * @example
    *    let val = 1
    *    function subtractTwo() { val -= 2 }
    *    function getVal() { return val }
    *    cy.wrap(subtractTwo).should('decrease', getVal)
    * @see http://chaijs.com/api/bdd/#method_decrease
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.decrease, fn: js.Function1[/* repeated */ js.Any, _]): Chainable[Subject] = js.native
  /**
    * When two arguments are provided, `.decrease` asserts that the value of the given object `subject`'s `prop` property is lesser after invoking the target function compared to beforehand.
    * @example
    *    let val = 1
    *    function subtractTwo() { val -= 2 }
    *    function getVal() { return val }
    *    cy.wrap(subtractTwo).should('decrease', getVal)
    * @see http://chaijs.com/api/bdd/#method_decrease
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.decrease, obj: js.Object, prop: java.lang.String): Chainable[Subject] = js.native
  /**
    * Causes all `.equal`, `.include`, `.members`, `.keys`, and `.property` assertions that follow in the chain to use deep equality instead of strict (`===`) equality. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({ a: 1 }).should('deep.equal', { a: 1 })
    * @see http://chaijs.com/api/bdd/#method_deep
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.deepDOTequal, value: Subject): Chainable[Subject] = js.native
  /**
    * Asserts that the target is deeply equal to the given `obj`. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({a: 1}).should('eql', {a: 1}).and('not.equal', {a: 1})
    * @see http://chaijs.com/api/bdd/#method_eql
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.eql, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is strictly (`===`) equal to the given `val`.
    * @example
    *    cy.wrap(1).should('equal', 1)
    * @see http://chaijs.com/api/bdd/#method_equal
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.equal, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is strictly (`===`) equal to the given `val`.
    * @example
    *    cy.wrap(1).should('eq', 1)
    * @alias equal
    * @see http://chaijs.com/api/bdd/#method_equal
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.eq, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to either `null` or `undefined`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(1).should('exist')
    * @see http://chaijs.com/api/bdd/#method_exist
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.exist): Chainable[Subject] = js.native
  /**
    * Causes all `.keys` assertions that follow in the chain to require that the target have all of the given keys. This is the opposite of `.any`, which only requires that the target have at least one of the given keys.
    * @example
    *    cy.wrap({ a: 1, b: 2 }).should('have.all.keys', 'a', 'b')
    * @see http://chaijs.com/api/bdd/#method_all
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTallDOTkeys, value: java.lang.String*): Chainable[Subject] = js.native
  /**
    * Assert spy always threw an exception.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwaysthrew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTalwaysDOTthrown): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTalwaysDOTthrown, value: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTalwaysDOTthrown, value: nodeLib.Error): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTalwaysDOTthrown, value: stdLib.ErrorConstructor): Chainable[Subject] = js.native
  /**
    * Causes all `.keys` assertions that follow in the chain to only require that the target have at least one of the given keys. This is the opposite of `.all`, which requires that the target have all of the given keys.
    * @example
    *    cy.wrap({ a: 1, b: 2 }).should('have.any.keys', 'a')
    * @see http://chaijs.com/api/bdd/#method_any
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTanyDOTkeys, value: java.lang.String*): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given attribute, using `.attr()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('have.attr', 'role')
    *    cy.get('#result').should('have.attr', 'role', 'menu')
    * @see http://chaijs.com/plugins/chai-jquery/#attrname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTattr, value: java.lang.String): Chainable[Subject] = js.native
  def apply(
    chainer: cypressLib.cypressLibStrings.haveDOTattr,
    value: java.lang.String,
    `match`: java.lang.String
  ): Chainable[Subject] = js.native
  /**
    * Assert the number of calls.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycallcount
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTcallCount, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given attribute, using `.attr()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('have.class', 'success')
    * @see http://chaijs.com/plugins/chai-jquery/#classclassname
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTclass, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given CSS property, using `.css()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('have.css', 'display', 'none')
    * @see http://chaijs.com/plugins/chai-jquery/#cssname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTcss, value: java.lang.String): Chainable[Subject] = js.native
  def apply(
    chainer: cypressLib.cypressLibStrings.haveDOTcss,
    value: java.lang.String,
    `match`: java.lang.String
  ): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given data value, using `.data()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('have.data', 'foo', 'bar')
    * @see http://chaijs.com/plugins/chai-jquery/#dataname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTdata, value: java.lang.String): Chainable[Subject] = js.native
  def apply(
    chainer: cypressLib.cypressLibStrings.haveDOTdata,
    value: java.lang.String,
    `match`: java.lang.String
  ): Chainable[Subject] = js.native
  /**
    * Asserts that the target has a property with the given key `name`. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({ x: {a: 1 }}).should('have.deep.property', 'x', { a: 1 })
    * @see http://chaijs.com/api/bdd/#method_property
    * @see https://on.cypress.io/assertions
    */
  def apply(
    chainer: cypressLib.cypressLibStrings.haveDOTdeepDOTproperty,
    value: java.lang.String,
    obj: js.Object
  ): Chainable[Subject] = js.native
  /**
    * Assert that the selection contains at least one element which has a descendant matching the given selector, using `.has()`.
    * @example
    *    cy.get('#result').should('have.descendants', 'h1')
    * @see http://chaijs.com/plugins/chai-jquery/#descendantsselector
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTdescendants, selector: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert that the html of the first element of the selection is equal to the given html, using `.html()`.
    * @example
    *    cy.get('#result').should('have.html', '<em>John Doe</em>')
    * @see http://chaijs.com/plugins/chai-jquery/#htmlhtml
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOThtml, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given id, using `.attr('id')`.
    * @example
    *    cy.get('#result').should('have.id', 'result')
    * @see http://chaijs.com/plugins/chai-jquery/#idid
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTid, value: java.lang.String): Chainable[Subject] = js.native
  def apply(
    chainer: cypressLib.cypressLibStrings.haveDOTid,
    value: java.lang.String,
    `match`: java.lang.String
  ): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is greater than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.greaterThan', 2)
    *    cy.wrap('foo').should('have.length.greaterThan', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTlengthDOTgreaterThan, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is greater than or equal to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.gte', 2)
    *    cy.wrap('foo').should('have.length.gte', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTlengthDOTgte, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is greater than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.gt', 2)
    *    cy.wrap('foo').should('have.length.gt', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTlengthDOTgt, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is less than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.lessThan', 4)
    *    cy.wrap('foo').should('have.length.lessThan', 4)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTlengthDOTlessThan, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is less than or equal to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.lte', 4)
    *    cy.wrap('foo').should('have.length.lte', 4)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTlengthDOTlte, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is less than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.lt', 4)
    *    cy.wrap('foo').should('have.length.lt', 4)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTlengthDOTlt, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is equal to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length', 3)
    *    cy.wrap('foo').should('have.length', 3)
    * @alias lengthOf
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTlength, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target array has the same members as the given array `set`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.members', [2, 1, 3])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTmembers, values: js.Array[_]): Chainable[Subject] = js.native
  /**
    * Asserts that the target array has the same members as the given array where order matters.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.ordered.members', [1, 2, 3])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTorderedDOTmembers, values: js.Array[_]): Chainable[Subject] = js.native
  /**
    * Causes all `.property` and `.include` assertions that follow in the chain to ignore inherited properties.
    * @example
    *    Object.prototype.b = 2
    *    cy.wrap({ a: 1 }).should('have.property', 'a').and('not.have.ownProperty', 'b')
    * @see http://chaijs.com/api/bdd/#method_ownproperty
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTownProperty, property: java.lang.String): Chainable[Subject] = js.native
  /**
    * Asserts that the target has a property with the given key `name`.
    * @example
    *    cy.wrap({ a: 1 }).should('have.property', 'a')
    *    cy.wrap({ a: 1 }).should('have.property', 'a', 1)
    * @see http://chaijs.com/api/bdd/#method_property
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTproperty, property: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTproperty, property: java.lang.String, value: js.Any): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given property, using `.prop()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('have.prop', 'disabled')
    *    cy.get('#result').should('have.prop', 'disabled', false)
    * @see http://chaijs.com/plugins/chai-jquery/#propname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTprop, value: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTprop, value: java.lang.String, `match`: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target string contains the given substring `str`.
    * @example
    *    cy.wrap('foobar').should('have.string', 'bar')
    * @see http://chaijs.com/api/bdd/#method_string
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTstring, `match`: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTstring, `match`: stdLib.RegExp): Chainable[Subject] = js.native
  /**
    * Assert that the text of the first element of the selection is equal to the given text, using `.text()`.
    * @example
    *    cy.get('#result').should('have.text', 'John Doe')
    * @see http://chaijs.com/plugins/chai-jquery/#texttext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTtext, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert spy threw an exception at least once.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spythrew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTthrown): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTthrown, value: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTthrown, value: nodeLib.Error): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTthrown, value: stdLib.ErrorConstructor): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given value, using `.val()`.
    * @example
    *    cy.get('textarea').should('have.value', 'foo bar baz')
    * @see http://chaijs.com/plugins/chai-jquery/#valuevalue
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.haveDOTvalue, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string `val` is a substring of the target.
    * @example
    *    cy.wrap([1, 2, 3]).should('include.members', [1, 2])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.includeDOTmembers, value: js.Array[_]): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string `val` is a substring of the target.
    * @example
    *    cy.wrap('foobar').should('include', 'foo')
    * @see http://chaijs.com/api/bdd/#method_include
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.include, value: js.Any): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.increase` asserts that the given function `subject` returns a greater number when it’s
    * invoked after invoking the target function compared to when it’s invoked beforehand.
    * `.increase` also causes all `.by` assertions that follow in the chain to assert how much greater of a number is returned.
    * It’s often best to assert that the return value increased by the expected amount, rather than asserting it increased by any amount.
    * @example
    *    let val = 1
    *    function addTwo() { val += 2 }
    *    function getVal() { return val }
    *    cy.wrap(addTwo).should('increase', getVal)
    * @see http://chaijs.com/api/bdd/#method_increase
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.increase, value: js.Object, property: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert spy not always returned the provided value.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwaysreturnedobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTalwaysDOTreturned, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a not number or not a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('not.be.above', 10)
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTabove, value: scala.Double): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTabove, value: stdLib.Date): Chainable[Subject] = js.native
  /**
    * Assert if spy was not always called with matching arguments (and possibly others).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwayscalledwithmatcharg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTalwaysDOTcalledWithMatch, args: js.Any*): Chainable[Subject] = js.native
  // sinon-chai.not
  /**
    * Assert spy/stub was not called the `new` operator.
    * Beware that this is inferred based on the value of the this object and the spy function’s prototype, so it may give false positives if you actively return the right kind of object.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithnew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTalwaysDOTcalledWithNew): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `type` is not equal to the given string type.
    * Types are case insensitive. See the `type-detect` project page for info on the type detection algorithm:
    * https://github.com/chaijs/type-detect.
    * @example
    *    cy.wrap('foo').should('not.be.an', 'object')
    * @alias a
    * @see http://chaijs.com/api/bdd/#method_a
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTan, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a not number that’s within a given +/- `delta` range of the given number `expected`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(5.1).should('not.be.approximately', 6, 0.5)
    * @alias closeTo
    * @see http://chaijs.com/api/bdd/#method_closeto
    * @see https://on.cypress.io/assertions
    */
  def apply(
    chainer: cypressLib.cypressLibStrings.notDOTbeDOTapproximately,
    value: scala.Double,
    delta: scala.Double
  ): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not an `arguments` object.
    * @example
    *    cy.wrap(1).should('not.be.arguments')
    * @see http://chaijs.com/api/bdd/#method_arguments
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTarguments): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or not a `n` date greater than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('not.be.at.least', 10)
    * @see http://chaijs.com/api/bdd/#method_least
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTatDOTleast, value: scala.Double): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTatDOTleast, value: stdLib.Date): Chainable[Subject] = js.native
  // chai.not
  /**
    * Asserts that the target’s `type` is not equal to the given string type.
    * Types are case insensitive. See the `type-detect` project page for info on the type detection algorithm:
    * https://github.com/chaijs/type-detect.
    * @example
    *    cy.wrap('foo').should('not.be.a', 'number')
    * @see http://chaijs.com/api/bdd/#method_a
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTa, `type`: java.lang.String): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or not a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('not.be.below', 1)
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTbelow, value: scala.Double): Chainable[Subject] = js.native
  /**
    * `true` if the spy was not called at least once
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTcalled): Chainable[Subject] = js.native
  /**
    * Assert spy was not.called after `anotherSpy`
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledafteranotherspy
    * @see https://on.cypress.io/assertions
    */
  def apply(
    chainer: cypressLib.cypressLibStrings.notDOTbeDOTcalledAfter,
    spy: sinonLib.sinonMod.SinonNs.SinonSpy
  ): Chainable[Subject] = js.native
  /**
    * Assert spy was not called before `anotherSpy`
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledbeforeanotherspy
    * @see https://on.cypress.io/assertions
    */
  def apply(
    chainer: cypressLib.cypressLibStrings.notDOTbeDOTcalledBefore,
    spy: sinonLib.sinonMod.SinonNs.SinonSpy
  ): Chainable[Subject] = js.native
  /**
    * Assert spy was not called exactly once
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledonce
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTcalledOnce): Chainable[Subject] = js.native
  /**
    * Assert spy was not called at least once with `obj` as `this`. `calledOn` also accepts a matcher (see [matchers](http://sinonjs.org/releases/v4.1.3/spies/#matchers)).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledonobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTcalledOn, context: js.Any): Chainable[Subject] = js.native
  /**
    * Assert spy was not called exactly three times
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledthrice
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTcalledThrice): Chainable[Subject] = js.native
  /**
    * Assert spy was not called exactly twice
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledtwice
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTcalledTwice): Chainable[Subject] = js.native
  /**
    * Assert spy was not called at least once with the provided arguments and no others.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithexactlyarg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTcalledWithExactly, args: js.Any*): Chainable[Subject] = js.native
  /**
    * Assert spy was not called with matching arguments (and possibly others).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithmatcharg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTcalledWithMatch, args: js.Any*): Chainable[Subject] = js.native
  /**
    * Assert spy/stub was not called the `new` operator.
    * Beware that this is inferred based on the value of the this object and the spy function’s prototype, so it may give false positives if you actively return the right kind of object.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithnew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTcalledWithNew): Chainable[Subject] = js.native
  // jquery-chai.not
  /**
    * Assert that at least one element of the selection is not checked, using `.is(':checked')`.
    * @example
    *    cy.get('#result').should('not.be.checked')
    * @see http://chaijs.com/plugins/chai-jquery/#checked
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTchecked): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number that’s within a given +/- `delta` range of the given number `expected`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(5.1).should('not.be.closeTo', 6, 0.5)
    * @see http://chaijs.com/api/bdd/#method_closeto
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTcloseTo, value: scala.Double, delta: scala.Double): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is not disabled, using `.is(':disabled')`.
    * @example
    *    cy.get('#result').should('not.be.disabled')
    * @see http://chaijs.com/plugins/chai-jquery/#disabled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTdisabled): Chainable[Subject] = js.native
  /**
    * When the target is a not string or array, .empty asserts that the target’s length property is strictly (===) equal to 0
    * @example
    *    cy.wrap([1]).should('not.be.empty')
    *    cy.wrap('foo').should('not.be.empty')
    * @see http://chaijs.com/api/bdd/#method_empty
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTempty): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is not enabled, using `.is(':enabled')`.
    * @example
    *    cy.get('#result').should('not.be.enabled')
    * @see http://chaijs.com/plugins/chai-jquery/#enabled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTenabled): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to `false`.
    * @example
    *    cy.wrap(true).should('not.be.false')
    * @see http://chaijs.com/api/bdd/#method_false
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTfalse): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a not number or a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.greaterThan', 7)
    * @alias above
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTgreaterThan, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a not number or a `n` date greater than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('not.be.gte', 7)
    * @alias least
    * @see http://chaijs.com/api/bdd/#method_least
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTgte, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a not number or a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('not.be.gt', 7)
    * @alias above
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTgt, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is not hidden, using `.is(':hidden')`.
    * @example
    *    cy.get('#result').should('not.be.hidden')
    * @see http://chaijs.com/plugins/chai-jquery/#hidden
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOThidden): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not an instance of the given `constructor`.
    * @example
    *    cy.wrap([1, 2]).should('not.be.instanceOf', String)
    * @see http://chaijs.com/api/bdd/#method_instanceof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTinstanceOf, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('not.be.lessThan', 3)
    * @alias below
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTlessThan, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or a date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('not.be.lte', 3)
    * @alias most
    * @see http://chaijs.com/api/bdd/#method_most
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTlte, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('not.be.lt', 3)
    * @alias below
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTlt, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not loosely (`==`) equal to `true`. However, it’s often best to assert that the target is strictly (`===`) or deeply equal to its expected value.
    * @example
    *    cy.wrap(0).should('not.be.ok')
    * @see http://chaijs.com/api/bdd/#method_ok
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTok): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is not selected, using `.is(':selected')`.
    * @example
    *    cy.get('#result').should('not.be.selected')
    * @see http://chaijs.com/plugins/chai-jquery/#selected
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTselected): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to true.
    * @example
    *    cy.wrap(false).should('not.be.true')
    * @see http://chaijs.com/api/bdd/#method_true
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTtrue): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to undefined.
    * @example
    *    cy.wrap(true).should('not.be.undefined')
    * @see http://chaijs.com/api/bdd/#method_undefined
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTundefined): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is not visible, using `.is(':visible')`.
    * @example
    *    cy.get('#result').should('not.be.visible')
    * @see http://chaijs.com/plugins/chai-jquery/#visible
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTvisible): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or a date greater than or equal to the given number or date `start`, and less than or equal to the given number or date `finish` respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(3).should('not.be.within', 5, 10)
    * @see http://chaijs.com/api/bdd/#method_within
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTwithin, start: scala.Double, end: scala.Double): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOTbeDOTwithin, start: stdLib.Date, end: stdLib.Date): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.change` asserts that the given function `subject` returns a different value when it’s invoked before the target function compared to when it’s invoked afterward.
    * However, it’s often best to assert that `subject` is equal to its expected value.
    * @example
    *    let dots = ''
    *    function addDot() { dots += '.' }
    *    function getDots() { return dots }
    *    cy.wrap(() => {}).should('not.change', getDots)
    * @see http://chaijs.com/api/bdd/#method_change
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTchange, fn: js.Function1[/* repeated */ js.Any, _]): Chainable[Subject] = js.native
  /**
    * When two arguments are provided, `.change` asserts that the value of the given object `subject`'s `prop` property is different before invoking the target function compared to afterward.
    * @example
    *    const myObj = { dots: '' }
    *    function addDot() { myObj.dots += '.' }
    *    cy.wrap(() => {}).should('not.change', myObj, 'dots')
    * @see http://chaijs.com/api/bdd/#method_change
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTchange, obj: js.Object, prop: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert that the selection does not contain the given text, using `:contains()`. If the object asserted against is not a jQuery object, or if `contain` is not called as a function, the original implementation will be called.
    * @example
    *    cy.get('#result').should('not.contain', 'text')
    * @see http://chaijs.com/plugins/chai-jquery/#containtext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTcontain, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string val is a substring of the target.
    * @example
    *    cy.wrap('tester').should('not.contain', 'foo')
    * @alias include
    * @see http://chaijs.com/api/bdd/#method_include
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTcontain, value: js.Any): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.decrease` asserts that the given function `subject` does not returns a lesser number when it’s invoked after invoking the target function compared to when it’s invoked beforehand.
    * `.decrease` also causes all `.by` assertions that follow in the chain to assert how much lesser of a number is returned. It’s often best to assert that the return value decreased by the expected amount, rather than asserting it decreased by any amount.
    * @example
    *    let val = 1
    *    function subtractTwo() { val -= 2 }
    *    function getVal() { return val }
    *    cy.wrap(() => {}).should('not.decrease', getVal)
    * @see http://chaijs.com/api/bdd/#method_decrease
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTdecrease, fn: js.Function1[/* repeated */ js.Any, _]): Chainable[Subject] = js.native
  /**
    * When two arguments are provided, `.decrease` asserts that the value of the given object `subject`'s `prop` property is not lesser after invoking the target function compared to beforehand.
    * @example
    *    const myObj = { val: 1 }
    *    function subtractTwo() { myObj.val -= 2 }
    *    cy.wrap(() => {}).should('not.decrease', myObj, 'val')
    * @see http://chaijs.com/api/bdd/#method_decrease
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTdecrease, obj: js.Object, prop: java.lang.String): Chainable[Subject] = js.native
  /**
    * Causes all `.equal`, `.include`, `.members`, `.keys`, and `.property` assertions that follow in the chain to not use deep equality instead of strict (`===`) equality. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({ a: 1 }).should('not.deep.equal', { b: 1 })
    * @see http://chaijs.com/api/bdd/#method_deep
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTdeepDOTequal, value: Subject): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not deeply equal to the given `obj`. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({a: 1}).should('not.eql', {c: 1}).and('not.equal', {a: 1})
    * @see http://chaijs.com/api/bdd/#method_eql
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTeql, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to the given `val`.
    * @example
    *    cy.wrap(1).should('not.equal', 2)
    * @see http://chaijs.com/api/bdd/#method_equal
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTequal, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to the given `val`.
    * @example
    *    cy.wrap(1).should('not.eq', 2)
    * @alias equal
    * @see http://chaijs.com/api/bdd/#method_equal
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTeq, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to either `null` or `undefined`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(null).should('not.exist')
    * @see http://chaijs.com/api/bdd/#method_exist
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTexist): Chainable[Subject] = js.native
  /**
    * Causes all `.keys` assertions that follow in the chain to not require that the target have all of the given keys. This is the opposite of `.any`, which only requires that the target have at least one of the given keys.
    * @example
    *    cy.wrap({ a: 1, b: 2 }).should('not.have.all.keys', 'c', 'd')
    * @see http://chaijs.com/api/bdd/#method_all
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTallDOTkeys, value: java.lang.String*): Chainable[Subject] = js.native
  /**
    * Assert spy did not always throw an exception.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwaysthrew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTalwaysDOTthrown): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTalwaysDOTthrown, value: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTalwaysDOTthrown, value: nodeLib.Error): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTalwaysDOTthrown, value: stdLib.ErrorConstructor): Chainable[Subject] = js.native
  /**
    * Causes all `.keys` assertions that follow in the chain to only require that the target not have at least one of the given keys. This is the opposite of `.all`, which requires that the target have all of the given keys.
    * @example
    *    cy.wrap({ a: 1, b: 2 }).should('not.have.any.keys', 'c')
    * @see http://chaijs.com/api/bdd/#method_any
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTanyDOTkeys, value: java.lang.String*): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given attribute, using `.attr()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('not.have.attr', 'role')
    *    cy.get('#result').should('not.have.attr', 'role', 'menu')
    * @see http://chaijs.com/plugins/chai-jquery/#attrname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTattr, value: java.lang.String): Chainable[Subject] = js.native
  def apply(
    chainer: cypressLib.cypressLibStrings.notDOThaveDOTattr,
    value: java.lang.String,
    `match`: java.lang.String
  ): Chainable[Subject] = js.native
  /**
    * Assert not the number of calls.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycallcount
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTcallCount, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given attribute, using `.attr()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('not.have.class', 'success')
    * @see http://chaijs.com/plugins/chai-jquery/#classclassname
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTclass, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given CSS property, using `.css()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('not.have.css', 'display', 'none')
    * @see http://chaijs.com/plugins/chai-jquery/#cssname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTcss, value: java.lang.String): Chainable[Subject] = js.native
  def apply(
    chainer: cypressLib.cypressLibStrings.notDOThaveDOTcss,
    value: java.lang.String,
    `match`: java.lang.String
  ): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given data value, using `.data()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('not.have.data', 'foo', 'bar')
    * @see http://chaijs.com/plugins/chai-jquery/#dataname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTdata, value: java.lang.String): Chainable[Subject] = js.native
  def apply(
    chainer: cypressLib.cypressLibStrings.notDOThaveDOTdata,
    value: java.lang.String,
    `match`: java.lang.String
  ): Chainable[Subject] = js.native
  /**
    * Asserts that the target does not have a property with the given key `name`. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({ x: {a: 1 }}).should('not.have.deep.property', 'y', { a: 1 })
    * @see http://chaijs.com/api/bdd/#method_property
    * @see https://on.cypress.io/assertions
    */
  def apply(
    chainer: cypressLib.cypressLibStrings.notDOThaveDOTdeepDOTproperty,
    value: java.lang.String,
    obj: js.Object
  ): Chainable[Subject] = js.native
  /**
    * Assert that the selection does not contain at least one element which has a descendant matching the given selector, using `.has()`.
    * @example
    *    cy.get('#result').should('not.have.descendants', 'h1')
    * @see http://chaijs.com/plugins/chai-jquery/#descendantsselector
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTdescendants, selector: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert that the html of the first element of the selection is not equal to the given html, using `.html()`.
    * @example
    *    cy.get('#result').should('not.have.html', '<em>John Doe</em>')
    * @see http://chaijs.com/plugins/chai-jquery/#htmlhtml
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOThtml, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given id, using `.attr('id')`.
    * @example
    *    cy.get('#result').should('not.have.id', 'result')
    * @see http://chaijs.com/plugins/chai-jquery/#idid
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTid, value: java.lang.String): Chainable[Subject] = js.native
  def apply(
    chainer: cypressLib.cypressLibStrings.notDOThaveDOTid,
    value: java.lang.String,
    `match`: java.lang.String
  ): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is not greater than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.length.greaterThan', 4)
    *    cy.wrap('foo').should('not.have.length.greaterThan', 4)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTlengthDOTgreaterThan, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is not greater than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.length.gt', 4)
    *    cy.wrap('foo').should('not.have.length.gt', 4)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTlengthDOTgt, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is less than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.lessThan', 2)
    *    cy.wrap('foo').should('have.length.lessThan', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTlengthDOTlessThan, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is not less than or equal to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.length.let', 2)
    *    cy.wrap('foo').should('not.have.length.lte', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTlengthDOTlte, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is not less than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.length.lt', 2)
    *    cy.wrap('foo').should('not.have.length.lt', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTlengthDOTlt, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is not equal to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.length', 2)
    * cy.wrap('foo').should('not.have.length', 2)
    * @alias lengthOf
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTlength, value: scala.Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target array does not have the same members as the given array `set`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.members', [4, 5, 6])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTmembers, values: js.Array[_]): Chainable[Subject] = js.native
  /**
    * Asserts that the target array does not have the same members as the given array where order matters.
    * @example
    *    cy.wrap([1, 2, 3]).should('not. have.ordered.members', [4, 5, 6])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTorderedDOTmembers, values: js.Array[_]): Chainable[Subject] = js.native
  /**
    * Causes all `.property` and `.include` assertions that follow in the chain to ignore inherited properties.
    * @example
    *    Object.prototype.b = 2
    *    cy.wrap({ a: 1 }).should('have.property', 'a').and('not.have.ownProperty', 'b')
    * @see http://chaijs.com/api/bdd/#method_ownproperty
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTownProperty, property: java.lang.String): Chainable[Subject] = js.native
  /**
    * Asserts that the target has a property with the given key `name`.
    * @example
    *    cy.wrap({ a: 1 }).should('not.have.property', 'b')
    *    cy.wrap({ a: 1 }).should('not.have.property', 'b', 1)
    * @see http://chaijs.com/api/bdd/#method_property
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTproperty, property: java.lang.String): Chainable[Subject] = js.native
  def apply(
    chainer: cypressLib.cypressLibStrings.notDOThaveDOTproperty,
    property: java.lang.String,
    value: js.Any
  ): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given property, using `.prop()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('not.have.prop', 'disabled')
    *    cy.get('#result').should('not.have.prop', 'disabled', false)
    * @see http://chaijs.com/plugins/chai-jquery/#propname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTprop, value: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTprop, value: java.lang.String, `match`: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target string does not contains the given substring `str`.
    * @example
    *    cy.wrap('foobar').should('not.have.string', 'baz')
    * @see http://chaijs.com/api/bdd/#method_string
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTstring, `match`: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTstring, `match`: stdLib.RegExp): Chainable[Subject] = js.native
  /**
    * Assert that the text of the first element of the selection is not equal to the given text, using `.text()`.
    * @example
    *    cy.get('#result').should('not.have.text', 'John Doe')
    * @see http://chaijs.com/plugins/chai-jquery/#texttext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTtext, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert spy did not throw an exception at least once.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spythrew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTthrown): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTthrown, value: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTthrown, value: nodeLib.Error): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTthrown, value: stdLib.ErrorConstructor): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given value, using `.val()`.
    * @example
    *    cy.get('textarea').should('not.have.value', 'foo bar baz')
    * @see http://chaijs.com/plugins/chai-jquery/#valuevalue
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOThaveDOTvalue, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string `val` is not a substring of the target.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.include.members', [4, 5])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTincludeDOTmembers, value: js.Array[_]): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string `val` is not a substring of the target.
    * @example
    *    cy.wrap('foobar').should('not.include', 'baz')
    * @see http://chaijs.com/api/bdd/#method_include
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTinclude, value: js.Any): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.increase` asserts that the given function `subject` returns a greater number when it’s
    * invoked after invoking the target function compared to when it’s invoked beforehand.
    * `.increase` also causes all `.by` assertions that follow in the chain to assert how much greater of a number is returned.
    * It’s often best to assert that the return value increased by the expected amount, rather than asserting it increased by any amount.
    * @example
    *    let val = 1
    *    function addTwo() { val += 2 }
    *    function getVal() { return val }
    *    cy.wrap(() => {}).should('not.increase', getVal)
    * @see http://chaijs.com/api/bdd/#method_increase
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTincrease, value: js.Object, property: java.lang.String): Chainable[Subject] = js.native
  /**
    * Asserts that the target does not match the given regular expression `re`.
    * @example
    *    cy.wrap('foobar').should('not.match', /baz$/)
    * @see http://chaijs.com/api/bdd/#method_match
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTmatch, value: java.lang.String): Chainable[Subject] = js.native
  def apply(chainer: cypressLib.cypressLibStrings.notDOTmatch, value: stdLib.RegExp): Chainable[Subject] = js.native
  /**
    * When the target is a non-function object, `.respondTo` asserts that the target does not have a `method` with the given name method. The method can be own or inherited, and it can be enumerable or non-enumerable.
    * @example
    *    class Cat {
    *      meow() {}
    *    }
    *    cy.wrap(new Cat()).should('not.respondTo', 'bark')
    * @see http://chaijs.com/api/bdd/#method_respondto
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTrespondTo, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert spy did not return the provided value at least once. (see [matchers](http://sinonjs.org/releases/v4.1.3/spies/#matchers))
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyreturnedobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.notDOTreturned, value: js.Any): Chainable[Subject] = js.native
  /**
    * Invokes the given `matcher` function with the target being passed as the first argument, and asserts that the value returned is falsy.
    * @example
    *    cy.wrap(1).should('not.satisfy', (num) => num < 0)
    * @see http://chaijs.com/api/bdd/#method_satisfy
    * @see https://on.cypress.io/assertions
    */
  def apply(
    chainer: cypressLib.cypressLibStrings.notDOTsatisfy,
    fn: js.Function1[/* val */ js.Any, scala.Boolean]
  ): Chainable[Subject] = js.native
  /**
    * When the target is a non-function object, `.respondTo` asserts that the target has a `method` with the given name method. The method can be own or inherited, and it can be enumerable or non-enumerable.
    * @example
    *    class Cat {
    *      meow() {}
    *    }
    *    cy.wrap(new Cat()).should('respondTo', 'meow')
    * @see http://chaijs.com/api/bdd/#method_respondto
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.respondTo, value: java.lang.String): Chainable[Subject] = js.native
  /**
    * Assert spy returned the provided value at least once. (see [matchers](http://sinonjs.org/releases/v4.1.3/spies/#matchers))
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyreturnedobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.returned, value: js.Any): Chainable[Subject] = js.native
  /**
    * Invokes the given `matcher` function with the target being passed as the first argument, and asserts that the value returned is truthy.
    * @example
    *    cy.wrap(1).should('satisfy', (num) => num > 0)
    * @see http://chaijs.com/api/bdd/#method_satisfy
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: cypressLib.cypressLibStrings.satisfy, fn: js.Function1[/* val */ js.Any, scala.Boolean]): Chainable[Subject] = js.native
  // fallback
  /**
    * Create an assertion. Assertions are automatically retried until they pass or time out.
    * Ctrl+Space will invoke auto-complete in most editors.
    * @see https://on.cypress.io/should
    */
  def apply(chainers: java.lang.String): Chainable[Subject] = js.native
  def apply(chainers: java.lang.String, value: js.Any): Chainable[Subject] = js.native
  def apply(chainers: java.lang.String, value: js.Any, `match`: js.Any): Chainable[Subject] = js.native
  /**
    * Create an assertion. Assertions are automatically retried until they pass or time out.
    * Passing a function to `.should()` enables you to make multiple assertions on the yielded subject. This also gives you the opportunity to massage what you’d like to assert on.
    * Just be sure _not_ to include any code that has side effects in your callback function. The callback function will be retried over and over again until no assertions within it throw.
    * @example
    *    cy
    *      .get('p')
    *      .should(($p) => {
    *        // should have found 3 elements
    *        expect($p).to.have.length(3)
    *
    *        // make sure the first contains some text content
    *        expect($p.first()).to.contain('Hello World')
    *
    *        // use jquery's map to grab all of their classes
    *        // jquery's map returns a new jquery object
    *        const classes = $p.map((i, el) => {
    *          return Cypress.$(el).attr('class')
    *        })
    *
    *        // call classes.get() to make this a plain array
    *        expect(classes.get()).to.deep.eq([
    *          'text-primary',
    *          'text-danger',
    *          'text-default'
    *        ])
    *      })
    * @see https://on.cypress.io/should
    */
  def apply(fn: js.Function1[/* currentSubject */ Subject, scala.Unit]): Chainable[Subject] = js.native
}

