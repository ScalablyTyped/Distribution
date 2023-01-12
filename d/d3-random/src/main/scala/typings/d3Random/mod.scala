package typings.d3Random

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("d3-random", "randomBates")
  @js.native
  val randomBates: RandomBates_ = js.native
  
  @JSImport("d3-random", "randomBernoulli")
  @js.native
  val randomBernoulli: RandomBernoulli_ = js.native
  
  @JSImport("d3-random", "randomBeta")
  @js.native
  val randomBeta: RandomBeta_ = js.native
  
  @JSImport("d3-random", "randomBinomial")
  @js.native
  val randomBinomial: RandomBinomial_ = js.native
  
  @JSImport("d3-random", "randomCauchy")
  @js.native
  val randomCauchy: RandomCauchy_ = js.native
  
  @JSImport("d3-random", "randomExponential")
  @js.native
  val randomExponential: RandomExponential_ = js.native
  
  @JSImport("d3-random", "randomGamma")
  @js.native
  val randomGamma: RandomGamma_ = js.native
  
  @JSImport("d3-random", "randomGeometric")
  @js.native
  val randomGeometric: RandomGeometric_ = js.native
  
  @JSImport("d3-random", "randomInt")
  @js.native
  val randomInt: RandomInt_ = js.native
  
  @JSImport("d3-random", "randomIrwinHall")
  @js.native
  val randomIrwinHall: RandomIrwinHall_ = js.native
  
  inline def randomLcg(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomLcg")().asInstanceOf[js.Function0[Double]]
  inline def randomLcg(seed: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomLcg")(seed.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  
  @JSImport("d3-random", "randomLogNormal")
  @js.native
  val randomLogNormal: RandomLogNormal_ = js.native
  
  @JSImport("d3-random", "randomLogistic")
  @js.native
  val randomLogistic: RandomLogistic_ = js.native
  
  @JSImport("d3-random", "randomNormal")
  @js.native
  val randomNormal: RandomNormal_ = js.native
  
  @JSImport("d3-random", "randomPareto")
  @js.native
  val randomPareto: RandomPareto_ = js.native
  
  @JSImport("d3-random", "randomPoisson")
  @js.native
  val randomPoisson: RandomPoisson_ = js.native
  
  @JSImport("d3-random", "randomUniform")
  @js.native
  val randomUniform: RandomUniform_ = js.native
  
  @JSImport("d3-random", "randomWeibull")
  @js.native
  val randomWeibull: RandomWeibull_ = js.native
  
  @js.native
  trait RandomBates_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with a Bates distribution with n independent variables.
      * The case of fractional n is handled as with d3.randomIrwinHall, and d3.randomBates(0) is equivalent to d3.randomUniform().
      *
      * @param n Number of independent random variables to use.
      */
    def apply(n: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomBernoulli_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating either 1 or 0 according to a Bernoulli distribution with 1 being returned with success probability p and 0 with failure probability q = 1 - p.
      * The value p is in the range [0, 1].
      *
      * @param p p
      */
    def apply(p: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomBeta_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with a beta distribution with alpha and beta shape parameters, which must both be positive.
      *
      * @param alpha Shape parameter
      * @param beta Shape paramter
      */
    def apply(alpha: Double, beta: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomBinomial_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating numbers with a geometric distribution with success probability p.
      * The value p is in the range (0, 1].
      *
      * @param p Success probability
      */
    def apply(p: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomCauchy_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with a Cauchy distribution.
      * a and b have the same meanings and default values as in d3.randomWeibull.
      *
      * @param a Location parameter
      * @param b Scale parameter
      */
    def apply(): js.Function0[Double] = js.native
    def apply(a: Double): js.Function0[Double] = js.native
    def apply(a: Double, b: Double): js.Function0[Double] = js.native
    def apply(a: Unit, b: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomExponential_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with an exponential distribution with the rate lambda;
      * equivalent to time between events in a Poisson process with a mean of 1 / lambda.
      *
      * @param lambda Expected time between events.
      */
    def apply(lambda: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomGamma_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with a gamma distribution with k the shape parameter and theta the scale parameter.
      * The value k must be a positive value; if theta is not specified, it defaults to 1.
      *
      * @param k Shape parameter
      * @param theta Scale paramter
      */
    def apply(k: Double): js.Function0[Double] = js.native
    def apply(k: Double, theta: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomGeometric_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating numbers with a geometric distribution with success probability p.
      * The value p is in the range [0, 1].
      *
      * @param p Success probability
      */
    def apply(p: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomInt_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random integers with a uniform distribution.
      * The minimum allowed value of a returned number is ⌊min⌋ (inclusive), and the maximum is ⌊max - 1⌋ (inclusive)
      * Min defaults to 0.
      *
      * @param max The maximum allowed value of a returned number.
      */
    def apply(max: Double): js.Function0[Double] = js.native
    /**
      * Returns a function for generating random integers with a uniform distribution.
      * The minimum allowed value of a returned number is ⌊min⌋ (inclusive), and the maximum is ⌊max - 1⌋ (inclusive)
      *
      * @param min The minimum allowed value of a returned number.
      * @param max The maximum allowed value of a returned number.
      */
    // tslint:disable-next-line:unified-signatures
    def apply(min: Double, max: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomIrwinHall_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with an Irwin–Hall distribution with n independent variables.
      * If the fractional part of n is non-zero, this is treated as adding d3.randomUniform() times that fractional part to the integral part.
      *
      * @param n Number of independent random variables to use.
      */
    def apply(n: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomLogNormal_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with a log-normal distribution. The expected value of the random variable’s natural logarithm is mu,
      * with the given standard deviation sigma. If mu is not specified, it defaults to 0; if sigma is not specified, it defaults to 1.
      *
      * @param mu Expected value, defaults to 0.
      * @param sigma Standard deviation, defaults to 1.
      */
    def apply(): js.Function0[Double] = js.native
    def apply(mu: Double): js.Function0[Double] = js.native
    def apply(mu: Double, sigma: Double): js.Function0[Double] = js.native
    def apply(mu: Unit, sigma: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomLogistic_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with a logistic distribution.
      * a and b have the same meanings and default values as in d3.randomWeibull.
      *
      * @param a Location parameter
      * @param b Scale parameter
      */
    def apply(): js.Function0[Double] = js.native
    def apply(a: Double): js.Function0[Double] = js.native
    def apply(a: Double, b: Double): js.Function0[Double] = js.native
    def apply(a: Unit, b: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomNormal_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with a normal (Gaussian) distribution.
      * The expected value of the generated numbers is mu, with the given standard deviation sigma.
      * If mu is not specified, it defaults to 0; if sigma is not specified, it defaults to 1.
      *
      * @param mu Expected value, defaults to 0.
      * @param sigma Standard deviation, defaults to 1.
      */
    def apply(): js.Function0[Double] = js.native
    def apply(mu: Double): js.Function0[Double] = js.native
    def apply(mu: Double, sigma: Double): js.Function0[Double] = js.native
    def apply(mu: Unit, sigma: Double): js.Function0[Double] = js.native
  }
  
  trait RandomNumberGenerationSource extends StObject {
    
    /**
      * Returns the same type of function for generating random numbers but where the given random number
      * generator source is used as the source of randomness instead of Math.random.
      * This is useful when a seeded random number generator is preferable to Math.random.
      *
      * @param source Source (pseudo-)random number generator implementing the Math.random interface.
      * The given random number generator must implement the same interface as Math.random and
      * only return values in the range [0, 1).
      */
    def source(source: js.Function0[Double]): this.type
  }
  object RandomNumberGenerationSource {
    
    inline def apply(source: js.Function0[Double] => RandomNumberGenerationSource): RandomNumberGenerationSource = {
      val __obj = js.Dynamic.literal(source = js.Any.fromFunction1(source))
      __obj.asInstanceOf[RandomNumberGenerationSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RandomNumberGenerationSource] (val x: Self) extends AnyVal {
      
      inline def setSource(value: js.Function0[Double] => RandomNumberGenerationSource): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RandomPareto_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with a Pareto distribution with the shape alpha.
      * The value alpha must be a positive value.
      *
      * @param alpha alpha
      */
    def apply(alpha: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomPoisson_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with a Poisson distribution with mean lambda.
      *
      * @param lambda Mean
      */
    def apply(lambda: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomUniform_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with a uniform distribution.
      * The minimum allowed value of a returned number is min (inclusive), and the maximum is max (exclusive).
      * Min defaults to 0; if max is not specified, it defaults to 1.
      *
      * @param max The maximum allowed value of a returned number, defaults to 1.
      */
    def apply(): js.Function0[Double] = js.native
    def apply(max: Double): js.Function0[Double] = js.native
    /**
      * Returns a function for generating random numbers with a uniform distribution.
      * The minimum allowed value of a returned number is min (inclusive), and the maximum is max (exclusive).
      *
      * @param min The minimum allowed value of a returned number.
      * @param max The maximum allowed value of a returned number.
      */
    // tslint:disable-next-line:unified-signatures
    def apply(min: Double, max: Double): js.Function0[Double] = js.native
  }
  
  @js.native
  trait RandomWeibull_
    extends StObject
       with RandomNumberGenerationSource {
    
    /**
      * Returns a function for generating random numbers with one of the generalized extreme value distributions, depending on k:
      * If k is positive, the Weibull distribution with shape parameter k
      * If k is zero, the Gumbel distribution
      * If k is negative, the Fréchet distribution with shape parameter −k
      * In all three cases, a is the location parameter and b is the scale parameter.
      * If a is not specified, it defaults to 0; if b is not specified, it defaults to 1.
      *
      * @param k Shape parameter
      * @param a Location parameter
      * @param b Scale parameter
      */
    def apply(k: Double): js.Function0[Double] = js.native
    def apply(k: Double, a: Double): js.Function0[Double] = js.native
    def apply(k: Double, a: Double, b: Double): js.Function0[Double] = js.native
    def apply(k: Double, a: Unit, b: Double): js.Function0[Double] = js.native
  }
}
