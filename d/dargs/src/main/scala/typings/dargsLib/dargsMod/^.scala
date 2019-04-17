package typings
package dargsLib.dargsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dargs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Reverse [`minimist`](https://github.com/substack/minimist). Convert an object of options into an array of command-line arguments.
  @param input - Object to convert to command-line arguments.
  @example
  ```
  import dargs = require('dargs');
  const input = {
  	_: ['some', 'option'],          // Values in '_' will be appended to the end of the generated argument list
  	'--': ['separated', 'option'],  // Values in '--' will be put at the very end of the argument list after the escape option (`--`)
  	foo: 'bar',
  	hello: true,                    // Results in only the key being used
  	cake: false,                    // Prepends `no-` before the key
  	camelCase: 5,                   // CamelCase is slugged to `camel-case`
  	multiple: ['value', 'value2'],  // Converted to multiple arguments
  	pieKind: 'cherry',
  	sad: ':('
  };
  const excludes = ['sad', /.*Kind$/];  // Excludes and includes accept regular expressions
  const includes = ['camelCase', 'multiple', 'sad', /^pie.+/];
  const aliases = {file: 'f'};
  console.log(dargs(input, {excludes}));
  // [
  // 	'--foo=bar',
  // 	'--hello',
  // 	'--no-cake',
  // 	'--camel-case=5',
  // 	'--multiple=value',
  // 	'--multiple=value2',
  // 	'some',
  // 	'option',
  // 	'--',
  // 	'separated',
  // 	'option'
  // ]
  console.log(dargs(input, {excludes, includes}));
  // [
  // 	'--camel-case=5',
  // 	'--multiple=value',
  // 	'--multiple=value2'
  // ]
  console.log(dargs(input, {includes}));
  // [
  // 	'--camel-case=5',
  // 	'--multiple=value',
  // 	'--multiple=value2',
  // 	'--pie-kind=cherry',
  // 	'--sad=:('
  // ]
  console.log(dargs({
  	foo: 'bar',
  	hello: true,
  	file: 'baz'
  }, {aliases}));
  // [
  // 	'--foo=bar',
  // 	'--hello',
  // 	'-f', 'baz'
  // ]
  ```
  */
  def apply(input: dargsLib.Anon_): js.Array[java.lang.String] = js.native
  def apply(input: dargsLib.Anon_, options: Options): js.Array[java.lang.String] = js.native
}

