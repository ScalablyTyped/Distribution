package typings.conventionalChangelogConfigSpec

import org.scalablytyped.runtime.Shortcut
import typings.conventionalChangelogConfigSpec.schemaDotjsonMod.Config.Type
import typings.jsonSchema.mod.JSONSchema7
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaDotjsonMod extends Shortcut {
  
  @JSImport("conventional-changelog-config-spec/versions/2.0.0/schema.json", JSImport.Namespace)
  @js.native
  val ^ : JSONSchema7 = js.native
  
  /**
    * Describes the configuration options supported by conventional-config for
    * upstream tooling.
    */
  @js.native
  trait Config extends StObject {
    
    /**
      * A URL representing a specific commit at a hash.
      *
      * @default
      * "{{host}}/{{owner}}/{{repository}}/commit/{{hash}}"
      */
    var commitUrlFormat: js.UndefOr[String] = js.native
    
    /**
      * A URL representing the comparison between two git SHAs.
      *
      * @default
      * "{{host}}/{{owner}}/{{repository}}/compare/{{previousTag}}...{{currentTag}}"
      */
    var compareUrlFormat: js.UndefOr[String] = js.native
    
    /**
      * A string to be used as the main header section of the CHANGELOG.
      *
      * @default
      * "# Changelog\n\n"
      */
    var header: js.UndefOr[String] = js.native
    
    /**
      * A URL representing the issue format (allowing a different URL format to be
      * swapped in for Gitlab, Bitbucket, etc).
      *
      * @default
      * "{{host}}/{{owner}}/{{repository}}/issues/{{id}}"
      */
    var issueUrlFormat: js.UndefOr[String] = js.native
    
    /**
      * Boolean indicating whether or not the action being run (generating CHANGELOG,
      * recommendedBump, etc.) is being performed for a pre-major release (<1.0.0).
      *
      * This config setting will generally be set by tooling and not a user.
      *
      * @default
      * false
      */
    var preMajor: js.UndefOr[Boolean] = js.native
    
    /**
      * A string to be used to format the auto-generated release commit message.
      *
      * @default
      * "chore(release): {{currentTag}}"
      */
    var releaseCommitMessageFormat: js.UndefOr[String] = js.native
    
    /**
      * An array of `type` objects representing the explicitly supported commit
      * message types, and whether they should show up in generated `CHANGELOG`s.
      *
      * @default
      * [
      *     { "type": "feat", "section": "Features" },
      *     { "type": "fix", "section": "Bug Fixes" },
      *     { "type": "chore", "hidden": true },
      *     { "type": "docs", "hidden": true },
      *     { "type": "style", "hidden": true },
      *     { "type": "refactor", "hidden": true },
      *     { "type": "perf", "hidden": true },
      *     { "type": "test", "hidden": true }
      * ]
      */
    var types: js.UndefOr[js.Array[Type]] = js.native
    
    /**
      * A URL representing the a user's profile URL on GitHub, Gitlab, etc. This URL
      * is used for substituting @bcoe with https://github.com/bcoe in commit
      * messages.
      *
      * @default
      * "{{host}}/{{user}}"
      */
    var userUrlFormat: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommitUrlFormat(value: String): Self = StObject.set(x, "commitUrlFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitUrlFormatUndefined: Self = StObject.set(x, "commitUrlFormat", js.undefined)
      
      @scala.inline
      def setCompareUrlFormat(value: String): Self = StObject.set(x, "compareUrlFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompareUrlFormatUndefined: Self = StObject.set(x, "compareUrlFormat", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIssueUrlFormat(value: String): Self = StObject.set(x, "issueUrlFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssueUrlFormatUndefined: Self = StObject.set(x, "issueUrlFormat", js.undefined)
      
      @scala.inline
      def setPreMajor(value: Boolean): Self = StObject.set(x, "preMajor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreMajorUndefined: Self = StObject.set(x, "preMajor", js.undefined)
      
      @scala.inline
      def setReleaseCommitMessageFormat(value: String): Self = StObject.set(x, "releaseCommitMessageFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseCommitMessageFormatUndefined: Self = StObject.set(x, "releaseCommitMessageFormat", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[Type]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: Type*): Self = StObject.set(x, "types", js.Array(value :_*))
      
      @scala.inline
      def setUserUrlFormat(value: String): Self = StObject.set(x, "userUrlFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUrlFormatUndefined: Self = StObject.set(x, "userUrlFormat", js.undefined)
    }
    
    /**
      * An object that describes a commit type's settings in the CHANGELOG.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.conventionalChangelogConfigSpec.schemaDotjsonMod.Config.Type.WithSection
      - typings.conventionalChangelogConfigSpec.schemaDotjsonMod.Config.Type.WithHidden
    */
    trait Type extends StObject
    object Type {
      
      /**
        * An object that describes a commit type's settings in the CHANGELOG.
        */
      @js.native
      trait Base extends StObject {
        
        /**
          * Set to `true` to hide matched commit types in the CHANGELOG.
          */
        var hidden: js.UndefOr[Boolean] = js.native
        
        /**
          * The section where the matched commit type will display in the CHANGELOG.
          */
        var section: js.UndefOr[String] = js.native
        
        /**
          * A string used to match <type>s used in the Conventional Commits convention.
          */
        var `type`: String = js.native
      }
      object Base {
        
        @scala.inline
        def apply(`type`: String): Base = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[Base]
        }
        
        @scala.inline
        implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
          
          @scala.inline
          def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * An object that describes a commit type's settings in the CHANGELOG.
        */
      @js.native
      trait WithHidden
        extends Base
           with Type {
        
        /**
          * Set to `true` to hide matched commit types in the CHANGELOG.
          */
        @JSName("hidden")
        var hidden_WithHidden: Boolean = js.native
      }
      @scala.inline
      def WithHidden(hidden: Boolean, `type`: String): typings.conventionalChangelogConfigSpec.schemaDotjsonMod.Config.Type.WithHidden = {
        val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.conventionalChangelogConfigSpec.schemaDotjsonMod.Config.Type.WithHidden]
      }
      object WithHidden {
        
        @scala.inline
        def apply(hidden: Boolean, `type`: String): WithHidden = {
          val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[WithHidden]
        }
        
        @scala.inline
        implicit class WithHiddenMutableBuilder[Self <: WithHidden] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * An object that describes a commit type's settings in the CHANGELOG.
        */
      @js.native
      trait WithSection
        extends Base
           with Type {
        
        /**
          * The section where the matched commit type will display in the CHANGELOG.
          */
        @JSName("section")
        var section_WithSection: String = js.native
      }
      @scala.inline
      def WithSection(section: String, `type`: String): typings.conventionalChangelogConfigSpec.schemaDotjsonMod.Config.Type.WithSection = {
        val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.conventionalChangelogConfigSpec.schemaDotjsonMod.Config.Type.WithSection]
      }
      object WithSection {
        
        @scala.inline
        def apply(section: String, `type`: String): WithSection = {
          val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[WithSection]
        }
        
        @scala.inline
        implicit class WithSectionMutableBuilder[Self <: WithSection] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        }
      }
    }
  }
  
  type _To = JSONSchema7
  
  /* This means you don't have to write `^`, but can instead just say `schemaDotjsonMod.foo` */
  override def _to: JSONSchema7 = ^
}
