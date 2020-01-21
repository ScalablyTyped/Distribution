package typings.conventionalChangelogWriter.mod

import typings.conventionalChangelogWriter.conventionalChangelogWriterBooleans.`false`
import typings.conventionalChangelogWriter.mod.Options.FinalizeContext
import typings.conventionalChangelogWriter.mod.Options.GenerateOn
import typings.conventionalChangelogWriter.mod.Options.Sort
import typings.conventionalChangelogWriter.mod.Options.Transform
import typings.conventionalCommitsParser.mod.Commit
import typings.conventionalCommitsParser.mod.Commit.Note
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] extends js.Object {
  /**
    * A compare function used to sort commit groups. If it's a string or array, it
    * sorts on the property(ies) by `localeCompare`. Will not sort if this is a
    * falsy value.
    *
    * The string can be a dot path to a nested object property.
    */
  var commitGroupsSort: js.UndefOr[Sort[CommitGroup[TCommit]]] = js.undefined
  /**
    * @defaults
    * [commit.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/commit.hbs)
    */
  var commitPartial: js.UndefOr[String] = js.undefined
  /**
    * A compare function used to sort commits. If it's a string or array, it sorts
    * on the property(ies) by `localeCompare`. Will not sort if this is a falsy
    * value.
    *
    * The string can be a dot path to a nested object property.
    *
    * @default
    * 'header'
    */
  var commitsSort: js.UndefOr[Sort[TransformedCommit[TCommit]]] = js.undefined
  /**
    * A function to get debug information.
    *
    * @default
    * function () {}
    */
  var debug: js.UndefOr[js.Function1[/* message */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    * If `true`, the stream will flush out the last bit of commits (could be empty)
    * to changelog.
    *
    * @default
    * true
    */
  var doFlush: js.UndefOr[Boolean] = js.undefined
  /**
    * Last chance to modify your context before generating a changelog.
    *
    * @defaults
    * Pass through.
    */
  var finalizeContext: js.UndefOr[FinalizeContext[TContext, TCommit]] = js.undefined
  /**
    * @defaults
    * [footer.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/footer.hbs)
    */
  var footerPartial: js.UndefOr[String] = js.undefined
  /**
    * When the upstream finishes pouring the commits it will generate a block of
    * logs if `doFlush` is `true`. However, you can generate more than one block
    * based on this criteria (usually a version) even if there are still commits
    * from the upstream.
    *
    * @remarks
    * It checks on the transformed commit chunk instead of the original one (you
    * can check on the original by access the `raw` object on the `commit`).
    * However, if the transformed commit is ignored it falls back to the original
    * commit.
    *
    * @remarks
    * If this value is a `string`, it checks the existence of the field. Set to
    * other type to disable it.
    *
    * @defaults
    * If `commit.version` is a valid semver.
    */
  var generateOn: js.UndefOr[GenerateOn[TContext, TCommit]] = js.undefined
  /**
    * How to group the commits. EG: based on the same type. If this value is falsy,
    * commits are not grouped.
    *
    * @default
    * 'type'
    */
  var groupBy: js.UndefOr[String | `false`] = js.undefined
  /**
    * @defaults
    * [header.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/header.hbs)
    */
  var headerPartial: js.UndefOr[String] = js.undefined
  /**
    * If `true`, reverted commits will be ignored.
    *
    * @default
    * true
    */
  var ignoreReverted: js.UndefOr[Boolean] = js.undefined
  /**
    * If this value is `true`, instead of emitting strings of changelog, it emits
    * objects containing the details the block.
    *
    * @remarks
    * The downstream must be in object mode if this is `true`.
    *
    * @default
    * false
    */
  var includeDetails: js.UndefOr[Boolean] = js.undefined
  /**
    * The main handlebars template.
    *
    * @defaults
    * [template.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/template.hbs)
    */
  var mainTemplate: js.UndefOr[String] = js.undefined
  /**
    * A compare function used to sort note groups. If it's a string or array, it
    * sorts on the property(ies) by `localeCompare`. Will not sort if this is a
    * falsy value.
    *
    * The string can be a dot path to a nested object property.
    *
    * @default
    * 'title'
    */
  var noteGroupsSort: js.UndefOr[Sort[NoteGroup]] = js.undefined
  /**
    * A compare function used to sort note groups. If it's a string or array, it
    * sorts on the property(ies) by `localeCompare`. Will not sort if this is a
    * falsy value.
    *
    * The string can be a dot path to a nested object property.
    *
    * @default
    * 'text'
    */
  var notesSort: js.UndefOr[Sort[Note]] = js.undefined
  /**
    * Partials that used in the main template, if any. The key should be the
    * partial name and the value should be handlebars template strings. If you are
    * using handlebars template files, read files by yourself.
    */
  var partials: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * The normal order means reverse chronological order. `reverse` order means
    * chronological order. Are the commits from upstream in the reverse order? You
    * should only worry about this when generating more than one blocks of logs
    * based on `generateOn`. If you find the last commit is in the wrong block
    * inverse this value.
    *
    * @default
    * false
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
  /**
    * Replace with new values in each commit.
    *
    * If this is an object, the keys are paths to a nested object property. the
    * values can be a string (static) and a function (dynamic) with the old value
    * and path passed as arguments. This value is merged with your own transform
    * object.
    *
    * If this is a function, the commit chunk will be passed as the argument and
    * the returned value would be the new commit object. This is a handy function
    * if you can't provide a transform stream as an upstream of this one. If
    * returns a falsy value this commit is ignored.
    *
    * A `raw` object that is originally poured form upstream is attached to `commit`.
    */
  var transform: js.UndefOr[Transform[TCommit, TContext]] = js.undefined
}

@JSImport("conventional-changelog-writer", "Options")
@js.native
object Options extends js.Object {
  @js.native
  object GenerateOn extends js.Object {
    type FunctionType[TContext /* <: Context */, TCommit /* <: Commit[String | Double | js.Symbol] */] = js.Function4[
        /* commit */ TransformedCommit[TCommit], 
        /* commits */ js.Array[TransformedCommit[TCommit]], 
        /* context */ GeneratedContext[TCommit, TContext], 
        /* options */ Options[TCommit, TContext], 
        Boolean
      ]
  }
  
  @js.native
  object Sort extends js.Object {
    type FunctionType[T] = js.Function2[/* a */ T, /* b */ T, Double]
  }
  
  @js.native
  object Transform extends js.Object {
    @js.native
    object ObjectType extends js.Object {
      type FunctionType[T] = js.Function2[/* value */ T, /* path */ String, T]
    }
    
    type FunctionType[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] = js.Function2[
        /* commit */ Commit[String | Double | js.Symbol], 
        /* context */ TContext, 
        TCommit | `false`
      ]
    type ObjectType = Record[String, js.Object | js.Function]
  }
  
  type FinalizeContext[TContext /* <: Context */, TCommit /* <: Commit[String | Double | js.Symbol] */] = js.Function4[
    /* context */ GeneratedContext[TCommit, TContext], 
    /* options */ Options[TCommit, TContext], 
    /* commits */ js.Array[TransformedCommit[TCommit]], 
    /* keyCommit */ TransformedCommit[TCommit], 
    GeneratedContext[TCommit, TContext]
  ]
  type GenerateOn[TContext /* <: Context */, TCommit /* <: Commit[String | Double | js.Symbol] */] = js.Function | String | js.Object
  type Sort[T] = js.Function | String | js.Array[String] | `false`
  type Transform[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] = js.Object | js.Function
}

