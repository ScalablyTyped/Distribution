package typings.commitlintLoad

import typings.commitlintLoad.commitlintLoadNumbers.`0`
import typings.commitlintLoad.commitlintLoadNumbers.`1`
import typings.commitlintLoad.commitlintLoadNumbers.`2`
import typings.commitlintLoad.commitlintLoadStrings.lowercase_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@commitlint/load", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[CommitlintConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[CommitlintConfig]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.commitlintLoad.commitlintLoadStrings.always
    - typings.commitlintLoad.commitlintLoadStrings.never
  */
  trait Applicability extends StObject
  object Applicability {
    
    inline def always: typings.commitlintLoad.commitlintLoadStrings.always = "always".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.always]
    
    inline def never: typings.commitlintLoad.commitlintLoadStrings.never = "never".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.never]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.commitlintLoad.commitlintLoadStrings.`lower-case`
    - typings.commitlintLoad.commitlintLoadStrings.lowercase_
    - typings.commitlintLoad.commitlintLoadStrings.lowerCase
    - typings.commitlintLoad.commitlintLoadStrings.`upper-case`
    - typings.commitlintLoad.commitlintLoadStrings.uppercase
    - typings.commitlintLoad.commitlintLoadStrings.`camel-case`
    - typings.commitlintLoad.commitlintLoadStrings.`kebab-case`
    - typings.commitlintLoad.commitlintLoadStrings.`pascal-case`
    - typings.commitlintLoad.commitlintLoadStrings.`sentence-case`
    - typings.commitlintLoad.commitlintLoadStrings.sentencecase
    - typings.commitlintLoad.commitlintLoadStrings.`start-case`
    - typings.commitlintLoad.commitlintLoadStrings.`snake-case`
  */
  trait Case extends StObject
  object Case {
    
    inline def `camel-case`: typings.commitlintLoad.commitlintLoadStrings.`camel-case` = "camel-case".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.`camel-case`]
    
    inline def `kebab-case`: typings.commitlintLoad.commitlintLoadStrings.`kebab-case` = "kebab-case".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.`kebab-case`]
    
    inline def `lower-case`: typings.commitlintLoad.commitlintLoadStrings.`lower-case` = "lower-case".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.`lower-case`]
    
    inline def lowerCase: typings.commitlintLoad.commitlintLoadStrings.lowerCase = "lowerCase".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.lowerCase]
    
    inline def lowercase: lowercase_ = "lowercase".asInstanceOf[lowercase_]
    
    inline def `pascal-case`: typings.commitlintLoad.commitlintLoadStrings.`pascal-case` = "pascal-case".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.`pascal-case`]
    
    inline def `sentence-case`: typings.commitlintLoad.commitlintLoadStrings.`sentence-case` = "sentence-case".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.`sentence-case`]
    
    inline def sentencecase: typings.commitlintLoad.commitlintLoadStrings.sentencecase = "sentencecase".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.sentencecase]
    
    inline def `snake-case`: typings.commitlintLoad.commitlintLoadStrings.`snake-case` = "snake-case".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.`snake-case`]
    
    inline def `start-case`: typings.commitlintLoad.commitlintLoadStrings.`start-case` = "start-case".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.`start-case`]
    
    inline def `upper-case`: typings.commitlintLoad.commitlintLoadStrings.`upper-case` = "upper-case".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.`upper-case`]
    
    inline def uppercase: typings.commitlintLoad.commitlintLoadStrings.uppercase = "uppercase".asInstanceOf[typings.commitlintLoad.commitlintLoadStrings.uppercase]
  }
  
  trait CommitlintConfig extends StObject {
    
    var `extends`: js.UndefOr[js.Array[String]] = js.undefined
    
    var rules: Rules
  }
  object CommitlintConfig {
    
    inline def apply(rules: Rules): CommitlintConfig = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitlintConfig]
    }
    
    extension [Self <: CommitlintConfig](x: Self) {
      
      inline def setExtends(value: js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      inline def setRules(value: Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.commitlintLoad.commitlintLoadNumbers.`0`
    - typings.commitlintLoad.commitlintLoadNumbers.`1`
    - typings.commitlintLoad.commitlintLoadNumbers.`2`
  */
  trait Level extends StObject
  object Level {
    
    inline def Disable: `0` = 0.asInstanceOf[`0`]
    
    inline def Error: `2` = 2.asInstanceOf[`2`]
    
    inline def Warn: `1` = 1.asInstanceOf[`1`]
  }
  
  type Rule[T] = js.Tuple3[Level | `0` | `1` | `2`, Applicability, T]
  
  trait Rules extends StObject {
    
    var `body-leading-blank`: js.UndefOr[Rule[Unit]] = js.undefined
    
    var `body-max-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `body-max-line-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `body-min-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `footer-leading-blank`: js.UndefOr[Rule[Unit]] = js.undefined
    
    var `footer-max-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `footer-max-line-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `footer-min-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `header-case`: js.UndefOr[Rule[Case]] = js.undefined
    
    var `header-full-stop`: js.UndefOr[Rule[String]] = js.undefined
    
    var `header-max-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `header-min-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `references-empty`: js.UndefOr[Rule[Unit]] = js.undefined
    
    var `scope-case`: js.UndefOr[Rule[Case]] = js.undefined
    
    var `scope-empty`: js.UndefOr[Rule[Unit]] = js.undefined
    
    var `scope-enum`: js.UndefOr[Rule[js.Array[String]]] = js.undefined
    
    var `scope-max-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `scope-min-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `signed-off-by`: js.UndefOr[Rule[String]] = js.undefined
    
    var `subject-case`: js.UndefOr[Rule[Case | js.Array[Case]]] = js.undefined
    
    var `subject-empty`: js.UndefOr[Rule[Unit]] = js.undefined
    
    var `subject-full-stop`: js.UndefOr[Rule[String]] = js.undefined
    
    var `subject-max-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `subject-min-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `type-case`: js.UndefOr[Rule[Case]] = js.undefined
    
    var `type-empty`: js.UndefOr[Rule[Unit]] = js.undefined
    
    var `type-enum`: js.UndefOr[Rule[js.Array[String]]] = js.undefined
    
    var `type-max-length`: js.UndefOr[Rule[Double]] = js.undefined
    
    var `type-min-length`: js.UndefOr[Rule[Double]] = js.undefined
  }
  object Rules {
    
    inline def apply(): Rules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rules]
    }
    
    extension [Self <: Rules](x: Self) {
      
      inline def `setBody-leading-blank`(value: Rule[Unit]): Self = StObject.set(x, "body-leading-blank", value.asInstanceOf[js.Any])
      
      inline def `setBody-leading-blankUndefined`: Self = StObject.set(x, "body-leading-blank", js.undefined)
      
      inline def `setBody-max-length`(value: Rule[Double]): Self = StObject.set(x, "body-max-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-max-lengthUndefined`: Self = StObject.set(x, "body-max-length", js.undefined)
      
      inline def `setBody-max-line-length`(value: Rule[Double]): Self = StObject.set(x, "body-max-line-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-max-line-lengthUndefined`: Self = StObject.set(x, "body-max-line-length", js.undefined)
      
      inline def `setBody-min-length`(value: Rule[Double]): Self = StObject.set(x, "body-min-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-min-lengthUndefined`: Self = StObject.set(x, "body-min-length", js.undefined)
      
      inline def `setFooter-leading-blank`(value: Rule[Unit]): Self = StObject.set(x, "footer-leading-blank", value.asInstanceOf[js.Any])
      
      inline def `setFooter-leading-blankUndefined`: Self = StObject.set(x, "footer-leading-blank", js.undefined)
      
      inline def `setFooter-max-length`(value: Rule[Double]): Self = StObject.set(x, "footer-max-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-max-lengthUndefined`: Self = StObject.set(x, "footer-max-length", js.undefined)
      
      inline def `setFooter-max-line-length`(value: Rule[Double]): Self = StObject.set(x, "footer-max-line-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-max-line-lengthUndefined`: Self = StObject.set(x, "footer-max-line-length", js.undefined)
      
      inline def `setFooter-min-length`(value: Rule[Double]): Self = StObject.set(x, "footer-min-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-min-lengthUndefined`: Self = StObject.set(x, "footer-min-length", js.undefined)
      
      inline def `setHeader-case`(value: Rule[Case]): Self = StObject.set(x, "header-case", value.asInstanceOf[js.Any])
      
      inline def `setHeader-caseUndefined`: Self = StObject.set(x, "header-case", js.undefined)
      
      inline def `setHeader-full-stop`(value: Rule[String]): Self = StObject.set(x, "header-full-stop", value.asInstanceOf[js.Any])
      
      inline def `setHeader-full-stopUndefined`: Self = StObject.set(x, "header-full-stop", js.undefined)
      
      inline def `setHeader-max-length`(value: Rule[Double]): Self = StObject.set(x, "header-max-length", value.asInstanceOf[js.Any])
      
      inline def `setHeader-max-lengthUndefined`: Self = StObject.set(x, "header-max-length", js.undefined)
      
      inline def `setHeader-min-length`(value: Rule[Double]): Self = StObject.set(x, "header-min-length", value.asInstanceOf[js.Any])
      
      inline def `setHeader-min-lengthUndefined`: Self = StObject.set(x, "header-min-length", js.undefined)
      
      inline def `setReferences-empty`(value: Rule[Unit]): Self = StObject.set(x, "references-empty", value.asInstanceOf[js.Any])
      
      inline def `setReferences-emptyUndefined`: Self = StObject.set(x, "references-empty", js.undefined)
      
      inline def `setScope-case`(value: Rule[Case]): Self = StObject.set(x, "scope-case", value.asInstanceOf[js.Any])
      
      inline def `setScope-caseUndefined`: Self = StObject.set(x, "scope-case", js.undefined)
      
      inline def `setScope-empty`(value: Rule[Unit]): Self = StObject.set(x, "scope-empty", value.asInstanceOf[js.Any])
      
      inline def `setScope-emptyUndefined`: Self = StObject.set(x, "scope-empty", js.undefined)
      
      inline def `setScope-enum`(value: Rule[js.Array[String]]): Self = StObject.set(x, "scope-enum", value.asInstanceOf[js.Any])
      
      inline def `setScope-enumUndefined`: Self = StObject.set(x, "scope-enum", js.undefined)
      
      inline def `setScope-max-length`(value: Rule[Double]): Self = StObject.set(x, "scope-max-length", value.asInstanceOf[js.Any])
      
      inline def `setScope-max-lengthUndefined`: Self = StObject.set(x, "scope-max-length", js.undefined)
      
      inline def `setScope-min-length`(value: Rule[Double]): Self = StObject.set(x, "scope-min-length", value.asInstanceOf[js.Any])
      
      inline def `setScope-min-lengthUndefined`: Self = StObject.set(x, "scope-min-length", js.undefined)
      
      inline def `setSigned-off-by`(value: Rule[String]): Self = StObject.set(x, "signed-off-by", value.asInstanceOf[js.Any])
      
      inline def `setSigned-off-byUndefined`: Self = StObject.set(x, "signed-off-by", js.undefined)
      
      inline def `setSubject-case`(value: Rule[Case | js.Array[Case]]): Self = StObject.set(x, "subject-case", value.asInstanceOf[js.Any])
      
      inline def `setSubject-caseUndefined`: Self = StObject.set(x, "subject-case", js.undefined)
      
      inline def `setSubject-empty`(value: Rule[Unit]): Self = StObject.set(x, "subject-empty", value.asInstanceOf[js.Any])
      
      inline def `setSubject-emptyUndefined`: Self = StObject.set(x, "subject-empty", js.undefined)
      
      inline def `setSubject-full-stop`(value: Rule[String]): Self = StObject.set(x, "subject-full-stop", value.asInstanceOf[js.Any])
      
      inline def `setSubject-full-stopUndefined`: Self = StObject.set(x, "subject-full-stop", js.undefined)
      
      inline def `setSubject-max-length`(value: Rule[Double]): Self = StObject.set(x, "subject-max-length", value.asInstanceOf[js.Any])
      
      inline def `setSubject-max-lengthUndefined`: Self = StObject.set(x, "subject-max-length", js.undefined)
      
      inline def `setSubject-min-length`(value: Rule[Double]): Self = StObject.set(x, "subject-min-length", value.asInstanceOf[js.Any])
      
      inline def `setSubject-min-lengthUndefined`: Self = StObject.set(x, "subject-min-length", js.undefined)
      
      inline def `setType-case`(value: Rule[Case]): Self = StObject.set(x, "type-case", value.asInstanceOf[js.Any])
      
      inline def `setType-caseUndefined`: Self = StObject.set(x, "type-case", js.undefined)
      
      inline def `setType-empty`(value: Rule[Unit]): Self = StObject.set(x, "type-empty", value.asInstanceOf[js.Any])
      
      inline def `setType-emptyUndefined`: Self = StObject.set(x, "type-empty", js.undefined)
      
      inline def `setType-enum`(value: Rule[js.Array[String]]): Self = StObject.set(x, "type-enum", value.asInstanceOf[js.Any])
      
      inline def `setType-enumUndefined`: Self = StObject.set(x, "type-enum", js.undefined)
      
      inline def `setType-max-length`(value: Rule[Double]): Self = StObject.set(x, "type-max-length", value.asInstanceOf[js.Any])
      
      inline def `setType-max-lengthUndefined`: Self = StObject.set(x, "type-max-length", js.undefined)
      
      inline def `setType-min-length`(value: Rule[Double]): Self = StObject.set(x, "type-min-length", value.asInstanceOf[js.Any])
      
      inline def `setType-min-lengthUndefined`: Self = StObject.set(x, "type-min-length", js.undefined)
    }
  }
}
