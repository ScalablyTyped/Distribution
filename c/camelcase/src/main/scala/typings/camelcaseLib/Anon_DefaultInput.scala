package typings
package camelcaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultInput extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function camelcase(
  // 	input: string | ReadonlyArray<string>,
  // 	options?: camelcase.Options
  // ): string;
  // export = camelcase;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  def apply(input: java.lang.String): java.lang.String = js.native
  def apply(input: java.lang.String, options: camelcaseLib.camelcaseMod.camelcaseNs.Options): java.lang.String = js.native
  def apply(input: js.Array[java.lang.String]): java.lang.String = js.native
  def apply(input: js.Array[java.lang.String], options: camelcaseLib.camelcaseMod.camelcaseNs.Options): java.lang.String = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function camelcase(
  // 	input: string | ReadonlyArray<string>,
  // 	options?: camelcase.Options
  // ): string;
  // export = camelcase;
  def default(input: java.lang.String): java.lang.String = js.native
  def default(input: java.lang.String, options: camelcaseLib.camelcaseMod.camelcaseNs.Options): java.lang.String = js.native
  def default(input: js.Array[java.lang.String]): java.lang.String = js.native
  def default(input: js.Array[java.lang.String], options: camelcaseLib.camelcaseMod.camelcaseNs.Options): java.lang.String = js.native
}

