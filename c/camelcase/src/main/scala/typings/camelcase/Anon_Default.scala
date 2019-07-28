package typings.camelcase

import typings.camelcase.camelcaseMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Convert a dash/dot/underscore/space separated string to camelCase or PascalCase: `foo-bar` → `fooBar`.
  	@param input - String to convert to camel case.
  	@example
  	```
  	import camelCase = require('camelcase');
  	camelCase('foo-bar');
  	//=> 'fooBar'
  	camelCase('foo_bar');
  	//=> 'fooBar'
  	camelCase('Foo-Bar');
  	//=> 'fooBar'
  	camelCase('Foo-Bar', {pascalCase: true});
  	//=> 'FooBar'
  	camelCase('--foo.bar', {pascalCase: false});
  	//=> 'fooBar'
  	camelCase('foo bar');
  	//=> 'fooBar'
  	console.log(process.argv[3]);
  	//=> '--foo-bar'
  	camelCase(process.argv[3]);
  	//=> 'fooBar'
  	camelCase(['foo', 'bar']);
  	//=> 'fooBar'
  	camelCase(['__foo__', '--bar'], {pascalCase: true});
  	//=> 'FooBar'
  	```
  	*/
  def apply(input: String): String = js.native
  def apply(input: String, options: Options): String = js.native
  def apply(input: js.Array[String]): String = js.native
  def apply(input: js.Array[String], options: Options): String = js.native
}

